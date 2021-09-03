package com.meng;

import com.alibaba.fastjson.JSONObject;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

/**
 * @Description: jedis事务操作
 * @author: mengxiangyan
 * @date: 2021/08/29/ 23:45
 */

public class TestTX {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1",6379);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("hello","world");
        jsonObject.put("name","meng");

        //开启事务
        Transaction mutil = jedis.multi();
        String s = jsonObject.toJSONString();

        try {
            mutil.set("user1",s);
            mutil.set("user2",s);
            mutil.exec();//执行事务
        }catch (Exception e){
            mutil.discard();//关闭事务
            e.printStackTrace();
        }finally {
            System.out.println(jedis.get("user1"));
            System.out.println(jedis.get("user2"));
            jedis.close();
        }
    }
}
