package com.Kon.Yui;

import com.Kon.mio.User;
import com.Kon.mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class Test {

    @Autowired
    private UserDao userMapper;


    @org.junit.jupiter.api.Test
    public void findAll(){
        System.out.println(("----- selectAll method test ------"));
        List<User> users = userMapper.selectList(null);
//        Assert.assertEquals(5, users.size());
        users.forEach(System.out::println);

    }

}
