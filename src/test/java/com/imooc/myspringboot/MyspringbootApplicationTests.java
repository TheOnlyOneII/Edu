package com.imooc.myspringboot;

import com.imooc.myspringboot.mapper.UserInfoMapper;
import com.imooc.myspringboot.mapper.UserMapper;
import com.imooc.myspringboot.pojo.User;
import com.imooc.myspringboot.pojo.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MyspringbootApplicationTests {

    @Autowired
    //private UserMapper userMapper;
    private UserInfoMapper userInfoMapper;


    @Test
    void contextLoads() {
        //List<User> users = userMapper.selectList(null);
        //users.forEach(System.out::println);
        List<UserInfo> userInfos = userInfoMapper.selectList(null);
        userInfos.forEach(System.out::println);
    }

}
