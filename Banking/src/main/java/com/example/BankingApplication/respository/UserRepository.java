package com.example.BankingApplication.respository;

import com.example.BankingApplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserId(int id);
    User findByname(String name);
    User findByage(Integer age);
    List<User> findBynationality(String nationality);

    User findByemail(String email);
}
