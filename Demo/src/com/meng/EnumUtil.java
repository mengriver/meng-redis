package com.meng;

/**
 * @Description: TODO
 * @author: mengxiangyan
 * @date: 2021/09/01/ 10:02
 */

import java.lang.reflect.Field;

import java.lang.reflect.InvocationTargetException;

import java.lang.reflect.Method;

import java.util.ArrayList;

import java.util.List;

public class EnumUtil {
    /**

     * 从变长的枚举参数列表中, 获取指定字段的集合 (eg: enum list -> status list )

     * @param fieldName 需要获取的字段名

     * @param enums 枚举类 可变参数

     * @return field list

     * @throws NoSuchFieldException 枚举类中没有 fieldName时, 抛出此异常

     * @throws NoSuchMethodException 枚举类中没有 fieldName的 get方法时, 抛出此异常

     * @throws InvocationTargetException 当被调用的方法的内部抛出了异常而没有被捕获时，将由此异常接收。

     * @throws IllegalAccessException 枚举类的构造方法访问权限时 private时, 抛出此异常

     */

    public static List getListByEnum(String fieldName, Enum... enums) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List list = new ArrayList();

        if (enums == null) {
            return list;

        }

        for (Enum e : enums) {
            Class < ? extends Enum> clazz = e.getClass();

            Field field = clazz.getDeclaredField(fieldName);

            String methodName = getFieldGetMethodName(field);

            if (methodName != null) {
                Method method = clazz.getMethod(methodName);

                Object returnValue = method.invoke(e);

                list.add(returnValue);

            }

        }

        return list;

    }

    public static String getFieldGetMethodName(Field field) {
        if (field == null) {
            return null;

        }

        String name = field.getName();

        return "get" + name.substring(0, 1).toUpperCase() + name.substring(1, name.length());

    }

    public static String getFieldSetMethodName(Field field) {
        if (field == null) {
            return null;

        }

        String name = field.getName();

        return "set" + name.substring(0, 1).toUpperCase() + name.substring(1, name.length());

    }

}
