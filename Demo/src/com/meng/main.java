package com.meng;

import com.meng.bean.Student;

/**
 * @Description: TODO
 * @author: mengxiangyan
 * @date: 2021/09/01/ 9:53
 */

public class main {

    public <T> void check(T t){
        if(t == null){
            System.out.println("参数为空，略略略");
        }
    }
    public void user(Student student){
        check(student);
    }
    public static void main(String[] args) {
        Student student = null;
        System.out.println(student == null);
    }
}
