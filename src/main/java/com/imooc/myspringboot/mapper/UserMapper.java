package com.imooc.myspringboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.imooc.myspringboot.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @ author TheOnlyOne
 */
//在对应的Mapper上面继承基本的接口BaseMapper
@Repository
public interface UserMapper extends BaseMapper<User> {
    //所有CRUD已经完成
}
