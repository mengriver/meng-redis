package com.meng.bean;

/**
 * @Description: TODO
 * @author: mengxiangyan
 * @date: 2021/09/01/ 17:34
 */

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
