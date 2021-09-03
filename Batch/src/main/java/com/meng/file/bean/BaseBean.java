package com.meng.file.bean;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;


import java.io.Serializable;

/**
 * @Description: TODO
 * @author: mengxiangyan
 * @date: 2021/09/02/ 17:42
 */
@Getter
@Setter
public class BaseBean implements Serializable {
    private String creater;
    private String updater;
    private Date createTime;
    private Date updateTime;
}
