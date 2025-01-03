package com.tekarch.UserMService.Service.Service;

import com.tekarch.UserMService.Models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public User createUser(User user);
    public String getUser();
    // public User inActiveUser( Long userId, User user);
    public Optional<User> getUserById(Long userId);
    public List<User> getAllUser();
    //public User updateUserById( Long userId, User user);
}
