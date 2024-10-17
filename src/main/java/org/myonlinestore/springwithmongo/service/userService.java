package org.myonlinestore.springwithmongo.service;

import org.myonlinestore.springwithmongo.model.userModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface userService {

    public userModel saveUser(userModel user);
    public Optional<userModel> getUserById(String id);
    public List<userModel> getUsers(userModel user);
    public String deleteUserById(String id);
    public userModel updateUserById(String id, userModel user);
}
