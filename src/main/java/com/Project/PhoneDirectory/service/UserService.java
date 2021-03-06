package com.Project.PhoneDirectory.service;

import com.Project.PhoneDirectory.model.UserLogin;
import com.Project.PhoneDirectory.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

     //Method to register new user
    public void registerUser(UserLogin user){
        userRepository.registerUser(user);
    }

    // Method to check credentials
    public UserLogin loginUser(UserLogin user){
        UserLogin existUser = userRepository.checkCredentials(user.getUsername(), user.getPassword());
        if(existUser == null)
        {
            return  null;
        }else {
            return existUser;
        }
    }
}
