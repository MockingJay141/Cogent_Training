package com.example.BankingApplication.service;

import com.example.BankingApplication.dto.UserRequest;
import com.example.BankingApplication.exceptionHandler.UserNotFoundException;
import com.example.BankingApplication.model.User;
import com.example.BankingApplication.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService{

    @Autowired
    UserRepository repository;

    @Override
    public User saveUser(UserRequest userRequest) {

        User user = User.build(0, userRequest.getName(), userRequest.getEmail(), userRequest.getMobileNo(),
                userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());


        return repository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public User getUserById(int id) throws UserNotFoundException {

        User user = repository.findByUserId(id);

        if(user != null){
            return user;
        }
        else
            throw new UserNotFoundException("User not found with Id: " + id);
    }

    @Override
    public User getUserByEmail(String email) throws UserNotFoundException {
        User user = repository.findByemail(email);

        if(user != null){
            return user;
        }
        else
            throw new UserNotFoundException("User not found with email: " + email);
    }

    @Override
    public User getUserByName(String name) throws UserNotFoundException {
        User user = repository.findByname(name);

        if(user != null){
            return user;
        }
        else
            throw new UserNotFoundException("User not found with name: " + name);
    }

    @Override
    public List<User> getUserByNationality(String nationality) throws UserNotFoundException {
        List<User> user = repository.findBynationality(nationality);

        if(user != null){
            return user;
        }
        else
            throw new UserNotFoundException("User not found with nationality: " + nationality);
    }

    @Override
    public User getUserByAge(Integer age) throws UserNotFoundException {
        User user = repository.findByage(age);

        if(user != null){
            return user;
        }
        else
            throw new UserNotFoundException("User not found with age: " + age);
    }

}
