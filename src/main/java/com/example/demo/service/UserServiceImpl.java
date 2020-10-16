package com.example.demo.service;

import com.example.demo.dao.User;
import com.example.demo.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> getUserList() {
        return userRepository.findAll();
    }
    public User findUserById(long id) {
        return userRepository.findById(id);
    }
    public void save(User user) {
        userRepository.save(user);
    }
    public void edit(User user) {
        userRepository.save(user);
    }
    public void delete(long id) {
        userRepository.deleteById(id);
    }
}
