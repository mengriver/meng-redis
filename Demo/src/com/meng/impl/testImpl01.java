package com.meng.impl;

import com.meng.testInterface;

/**
 * @Description: TODO
 * @author: mengxiangyan
 * @date: 2021/09/01/ 9:52
 */

public class testImpl01 implements testInterface {
    @Override
    public void test1() {
        System.out.println("我是测试类01使用了方法test1");
    }

    @Override
    public void test2() {
        System.out.println("我是测试类01使用了方法test2");
    }
}
