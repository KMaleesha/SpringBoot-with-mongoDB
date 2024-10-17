package org.myonlinestore.springwithmongo.controller;

import org.myonlinestore.springwithmongo.model.userModel;
import org.myonlinestore.springwithmongo.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class userController {

    @Autowired
    private userService userservice;

    @PostMapping(value = "/save")
    public userModel save(@RequestBody userModel user){
        return userservice.saveUser(user);
    }

    @GetMapping(value= "/get-user/{id}")
    public Optional<userModel> getUser(@PathVariable String id){
        return userservice.getUserById(id);
    }

    @GetMapping(value="/users")
    public List<userModel> getAllUsers(userModel users){
        return userservice.getUsers(users);
    }

    @DeleteMapping(value="/delete/{id}")
    public String deleteUser(@PathVariable String id){
        return userservice.deleteUserById(id);
    }

    @PutMapping(value = "/update/{id}")
    public userModel updateUser(@PathVariable String id, @RequestBody userModel user){
        return userservice.updateUserById(id, user);
    }

}
