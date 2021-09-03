package com.meng;

import redis.clients.jedis.Jedis;

/**
 * @Description: TODO
 * @author: mengxiangyan
 * @date: 2021/08/29/ 23:37
 */

public class TestPing {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1");
        System.out.println(jedis.ping());
    }
}
