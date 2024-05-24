package com.example.BankingApplication.controller;

import com.example.BankingApplication.dto.UserRequest;
import com.example.BankingApplication.exceptionHandler.UserNotFoundException;
import com.example.BankingApplication.model.User;
import com.example.BankingApplication.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/saveUserData")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequest userRequest){
        return new ResponseEntity<>(userService.saveUser(userRequest), HttpStatus.CREATED);
    }

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id) throws UserNotFoundException{
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<User> getUserByEmail(@PathVariable String email) throws UserNotFoundException{
        return ResponseEntity.ok(userService.getUserByEmail(email));
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<User> getUserByName(@PathVariable String name) throws UserNotFoundException{
        return ResponseEntity.ok(userService.getUserByName(name));
    }

    @GetMapping("/nationality/{nationality}")
    public ResponseEntity<List<User>> getUserByNationality(@PathVariable String nationality) throws UserNotFoundException{
        return ResponseEntity.ok(userService.getUserByNationality(nationality));
    }
    @GetMapping("/age/{age}")
    public ResponseEntity<User> getUserByAge(@PathVariable Integer age) throws UserNotFoundException{
        return ResponseEntity.ok(userService.getUserByAge(age));
    }
}
