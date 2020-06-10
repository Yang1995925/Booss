package com.Boos.service.Impl;

import com.Boos.entity.Users;
import com.Boos.entity.UsersExample;
import com.Boos.mapping.UsersMapper;
import com.Boos.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UsersServiceImpl implements UsersService {
    @Autowired
   private UsersMapper usersMapper;
    @Override
    public List<Users> getAllUsers() {
        UsersExample usersExample =new UsersExample();
        return usersMapper.selectByExample(usersExample);
    }
}
