package com.tekarch.UserMService.Controller;

import com.tekarch.UserMService.Models.User;
import com.tekarch.UserMService.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/userMS")
@RestController
public class UserController {

        @Autowired
        private final UserServiceImpl userService;

        public UserController(UserServiceImpl userService) {
            this.userService = userService;
        }

        @GetMapping("/user")
        public  String getUser(){
            return userService.getUser();
        }

        @GetMapping("/acct")
        public String getAccount(){
            return userService.getAccount();
        }
        @PostMapping("/user")
        public User createUser(@RequestBody User user){
            return userService.createUser(user);

        }
//
//    @GetMapping("/user")
//    public List<User> getAllUser(){
//
//        return userService.getAllUser();
//    }


//    @GetMapping("/{userId}")
//    public Optional<User> getUserById(@RequestBody Long userId){
//
//       return userService.getUserById(userId);
//    }




}
