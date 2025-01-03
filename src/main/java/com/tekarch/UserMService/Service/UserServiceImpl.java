package com.tekarch.UserMService.Service;

import com.tekarch.UserMService.Models.User;
import com.tekarch.UserMService.Repository.UserRepo;
import com.tekarch.UserMService.Service.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl  implements UserService {
    // @Autowired
    private final UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo, RestTemplate restTemplate) {
        this.userRepo = userRepo;
        this.restTemplate = restTemplate;
    }


//    @Override
//    public User inActiveUser(Long userId, User user) {
//        userRepo.findById(userId);
//       userRepo.updateUserById(userId, user);
//
//
//    }

    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public String getUser() {
        return "This is User Management Microservice";
    }

    @Override
    public Optional<User> getUserById(Long userId) {

        return userRepo.findById(userId);

    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }


    @Autowired
    private final RestTemplate restTemplate;

    private static final String ACCOUNT_SERVICE_URL = "http://localhost:8082/accounts/account";



    public String getAccount() {
        String ACCOUNT_SERVICE_URL = "http://localhost:8082/accounts/account" ;
        return restTemplate.getForObject(ACCOUNT_SERVICE_URL, String.class);
    }
}
