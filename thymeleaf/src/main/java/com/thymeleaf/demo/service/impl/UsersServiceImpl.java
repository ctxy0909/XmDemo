package com.thymeleaf.demo.service.impl;

import com.thymeleaf.demo.domain.Users;
import com.thymeleaf.demo.mapper.UsersMapper;
import com.thymeleaf.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;

    public List<Users> findAll() {
        return usersMapper.findAll();
    }
}
