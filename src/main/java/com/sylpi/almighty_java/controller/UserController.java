package com.sylpi.almighty_java.controller;

import com.sylpi.almighty_java.entity.User;
import com.sylpi.almighty_java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<User> allUsers(){
        return userService.allUsers();
    }

    @RequestMapping("/{id}")
    public User byId(@PathVariable Long id){
        return userService.findById(id);
    }

    @PostMapping("/add")
    public User createUser(@RequestBody User user){
        userService.create(user);
        return user;
    }

    @DeleteMapping("/{id}")
    public String delUser(@PathVariable Long id){
        userService.deleteUser(id);
        return "deleted user with id " + id;
    }

}
