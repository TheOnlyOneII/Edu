package com.imooc.myspringboot.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author TheOnlyOne
 * @since 2020-09-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@AllArgsConstructor //使用后添加一个构造函数，该构造函数含有所有已声明字段属性参数
@NoArgsConstructor  //使用后创建一个无参构造函数
public class UserInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String account;

    private String password;

    private String name;

    private Integer sex;

    private Integer type;
    private Date createTime;
}
