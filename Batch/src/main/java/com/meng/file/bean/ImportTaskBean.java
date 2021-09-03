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
 * @date: 2021/09/02/ 17:59
 */
@Getter
@Setter
@TableName("IMPORT_TASK")

public class ImportTaskBean extends BaseBean{

    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer bizType;
    private Integer taskType;
    private Integer fileName;
    private Integer fileFormat;
    // 1、导入中 2、处理中（某些导入数据可能要写入对应的任务表）3、导入成功 4、部分成功 5、导入失败
    private Integer status;
    private String term;
    // 任务时间
    private Date taskTime;
    // 任务执行时间
    private Date executeTime;
    // 文件导入对象id 最好导入的文件存下来，避免某些奇怪的业务要求
    private String fileObject;
    // 如果导入中有失败记录，导出错误表格对象
    private String errorFileObject;

    // 成功数
    private Integer successNum;

    // 失败数
    private Integer failNum;

    // 导入总数
    private Integer totalNum;
}
