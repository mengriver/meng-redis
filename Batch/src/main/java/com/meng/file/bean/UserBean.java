package com.meng.file.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description: TODO
 * @author: mengxiangyan
 * @date: 2021/09/02/ 17:51
 */
@Getter
@Setter
@TableName("USER")
public class UserBean extends BaseBean{

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer age;

    private String address;
}
