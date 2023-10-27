package com.example.xtracap.assgn.controller;



import com.example.xtracap.assgn.model.User;
import com.example.xtracap.assgn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")

    public ModelAndView userList() {
        ModelAndView modelAndView = new ModelAndView("user_list");
        modelAndView.addObject("users", userRepository.findAll());
        modelAndView.addObject("user", new User());
        System.out.println(modelAndView);
        return modelAndView;
    }

    @PostMapping("/add")
    @ResponseBody
    public User addUser( @RequestBody User user, BindingResult bindingResult) {
        System.out.println("data coming correctly"+" "+user.getEmail()+" "+user.getFathersName());
        if (bindingResult.hasErrors()) {
            throw new IllegalArgumentException("Invalid user data");
        }
        return userRepository.save(user);
    }
}
