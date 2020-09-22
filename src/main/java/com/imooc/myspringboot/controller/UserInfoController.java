package com.imooc.myspringboot.controller;



import com.imooc.myspringboot.mapper.UserInfoMapper;
import com.imooc.myspringboot.mapper.UserMapper;
import com.imooc.myspringboot.pojo.User;
import com.imooc.myspringboot.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author 胖小猿
 * @since 2020-09-17
 */

@RequestMapping("/glz/user-info")
@Controller
public class UserInfoController {
    @Autowired
    UserInfoMapper userInfoMapper;


    public void selectUsers(){
        List<UserInfo> userInfos = userInfoMapper.selectList(null);
        userInfos.forEach(System.out::println);
    }

    @RequestMapping("/login")
    public String login(String account,String passowrd){
        UserInfo userInfo = new UserInfo();
        userInfo.setAccount(account);
        userInfo.setPassword(passowrd);
        System.out.println(userInfo.toString());
        userInfoMapper.selectOne(userInfo);
        return "test";
    }

    //登录
    //@RequestMapping("/goHouse")
    //@ResponseBody
    //public APIResponse goHouse(Str ing uname,String ph ){
    //    HosUser hosUser=new HosUser();
    //    hosUser.setUname(uname);
    //    hosUser.setHospassword(ph);
    //    System.out.println(hosUser);
    //    try {
    //        HosUser hosUser1 = hosUserService.getOne(new QueryWrapper<HosUser>().eq("uname", hosUser.getUname())
    //                .eq("hospassword", hosUser.getHospassword()),false);
    //        System.out.println(hosUser1);
    //        if (hosUser1!=null) {
    //            return APIResponseUtil.BooleanCode(true);
    //        } else {
    //            return APIResponseUtil.BooleanCode(false);
    //        }
    //    } catch (Exception e) {
    //        e.printStackTrace();
    //        return APIResponseUtil.BooleanCode(false);
    //    }
    //}

}

