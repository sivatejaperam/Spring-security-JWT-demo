package com.speram.nshopper.controllers;

import com.speram.nshopper.dao.UserRepository;
import com.speram.nshopper.modal.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepo;

    @PostMapping("/user")
    public User save(@RequestBody User user){
        return userRepo.save(user);
    }

    @GetMapping("/users")
    public List<User> getAll(){
        return userRepo.findAll();
    }

    @GetMapping("/user/{id}")
    public Optional<User> findUser(@PathVariable Long id){
        return userRepo.findById(id);
    }
}
