package com.onlineshopping.userservice.controller;

import com.onlineshopping.userservice.entity.Users;
import com.onlineshopping.userservice.service.UserService;
import com.onlineshopping.userservice.virtualObject.UserWithProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;
    @PostMapping
    public ResponseEntity<Users> saveUser(@RequestBody Users users){
        return new ResponseEntity<>(userService.saveUser(users), HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserWithProduct> returnUserWithProductDetails(@PathVariable("userId") Long userId){
        return new ResponseEntity<>(userService.getUserWithProductDetail(userId),HttpStatus.OK);
    }
}
