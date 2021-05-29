package com.test.news.service;

import com.test.news.dao.UserRepository;
import com.test.news.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @date 2018/3/20 17:52
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByName(String name){
        return userRepository.findByName(name);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public void insert(User user){
        userRepository.save(user);
    }

    public  void update(User user){
        userRepository.save(user);
    }

}
