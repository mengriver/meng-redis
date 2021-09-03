package com.meng.file.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description: TODO
 * @author: mengxiangyan
 * @date: 2021/09/02/ 17:54
 */
@Getter
@Setter
@TableName("BIZ_TASK")
public class BizTaskBean extends BaseBean{
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer bizType;
    private Integer bizName;
    private Integer operType;
    private Integer taskType;
    private Integer taskName;
    private String term;
}
