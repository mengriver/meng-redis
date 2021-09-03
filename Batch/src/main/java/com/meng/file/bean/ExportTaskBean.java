package com.meng.file.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @Description: TODO
 * @author: mengxiangyan
 * @date: 2021/09/02/ 17:56
 */
@Getter
@Setter
@TableName("EXPORT_TASK")
public class ExportTaskBean extends BaseBean{
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer bizType;
    private Integer taskType;
    private String fileName;
    private String fileFormat;

    // 1、下载中 2、下载成功 3、下载失败
    private Integer status;

    private String term;

    // 任务时间
    private Date taskTime;

    //任务执行时间
    private Date executeTime;

    // 文件淡出对象id
    private String fileObject;
}
