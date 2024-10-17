package org.myonlinestore.springwithmongo.service.impl;

import org.myonlinestore.springwithmongo.model.userModel;
import org.myonlinestore.springwithmongo.repository.userRepository;
import org.myonlinestore.springwithmongo.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class userServiceImpl implements userService {

    @Autowired
    private userRepository userRepo;

    @Override
    public userModel saveUser(userModel user) {
        return userRepo.save(user);
    }

    @Override
    public Optional<userModel> getUserById(String id) {
        return userRepo.findById(id);
    }

    @Override
    public List<userModel> getUsers(userModel user) {
        return userRepo.findAll();
    }

    @Override
    public String deleteUserById(String id) {
        Optional<userModel> user = userRepo.findById(id);
        if(user.isPresent()) {
            userRepo.deleteById(id);
            return "User deleted";
        }else {
            return "User not found";
        }
    }

    @Override
    public userModel updateUserById(String id, userModel user) {
        Optional<userModel> updateUser = userRepo.findById(id);

        if(updateUser.isPresent()) {
            userModel newUser = updateUser.get();

            newUser.setUsername(user.getUsername());
            newUser.setEmail(user.getEmail());
            newUser.setAge(user.getAge());
            newUser.setMobileNumber(user.getMobileNumber());
            return userRepo.save(newUser);
        }else{
            throw new RuntimeException("User not found with id: " + id);
        }
    }
}
