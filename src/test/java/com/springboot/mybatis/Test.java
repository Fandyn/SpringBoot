package com.springboot.mybatis;

import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.springboot.domain.User;
import com.springboot.mybatis.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class Test {

    @Autowired
    private UserDao userMapper;

    @org.junit.jupiter.api.Test
    public void findAll(){
        List<User> users = new ArrayList<>();
        users = userMapper.selectList(null);
        users.forEach(System.out::println);

    }

}
