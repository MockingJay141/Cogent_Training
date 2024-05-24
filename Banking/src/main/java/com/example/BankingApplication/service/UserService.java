package com.example.BankingApplication.service;

import com.example.BankingApplication.dto.UserRequest;
import com.example.BankingApplication.exceptionHandler.UserNotFoundException;
import com.example.BankingApplication.model.User;

import java.util.List;

public interface UserService {

    User saveUser(UserRequest userRequest);

    List<User> getAllUsers();

    User getUserById(int id) throws UserNotFoundException;

    User getUserByEmail(String email) throws UserNotFoundException;

    User getUserByName(String name) throws UserNotFoundException;

    List<User> getUserByNationality(String nationality) throws UserNotFoundException;

    User getUserByAge(Integer age) throws UserNotFoundException;
}
