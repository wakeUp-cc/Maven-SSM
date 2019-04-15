package com.cc.service.impl;

import com.cc.dao.UserDao;
import com.cc.domain.User;
import com.cc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User findAll(Integer id) {
        return userDao.findAll(id);
    }
}