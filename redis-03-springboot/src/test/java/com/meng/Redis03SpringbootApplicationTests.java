package com.meng;

import com.meng.bean.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Redis03SpringbootApplicationTests {

//
//    @Autowired
//    private RedisTemplate redisTemplate;
//    @Test
//    void contextLoads() {
//
//        //redisTemplate
//        //opsForValue 操作字符串 类似String
//        //opsForList 操作list 类似list
//        //opsForSet
//        //opsForHash
//        //获取连接对象
////        RedisConnection connection = redisTemplate.getConnectionFactory().getConnection();
////        connection.flushAll();
////        connection.flushDb();
//        redisTemplate.opsForValue().set("name",1);
//        System.out.println(redisTemplate.opsForValue().get("name"));
//    }


    public <T> void check(T t){
        if(t == null){
            System.out.println("参数为空，略略略");
        }
    }
    @Test
    public void test01(){
        Student student = null;
        check(student);
    }

}
