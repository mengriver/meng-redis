package com.meng;

import org.springframework.context.annotation.Configuration;

/**
 * @Description: TODO
 * @author: mengxiangyan
 * @date: 2021/08/30/ 0:36
 */

@Configuration
public class RedisConfig {

    // 编写我们自己的redisTemplate
//    @Bean
//    @SuppressWarnings("all")
//    public RedisTemplate<String,Object> redisTemplate(RedisConnectionFactory redisConnectionFactory){
//        RedisTemplate<String, Object> template = new RedisTemplate<>();
//
//        template.setConnectionFactory(redisConnectionFactory);
//
//        // json序列化配置
//        Jackson2JsonRedisSerializer<Object> objectJackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<Object>();
//        ObjectMapper om = new ObjectMapper();
//        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//        objectJackson2JsonRedisSerializer.setObjectMapper(om);
//        // String的序列化
//        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
//
//        // key采用String的序列化方式
//        template.setKeySerializer(stringRedisSerializer);
//        // hash的key也采用String的序列化方式
//        template.setHashKeySerializer(stringRedisSerializer);
//        // value序列化方式采用jackson
//        template.setValueSerializer(objectJackson2JsonRedisSerializer);
//        // hash的value蓄力阿华方式采用jsckson
//        template.setHashValueSerializer(objectJackson2JsonRedisSerializer);
//        template.afterPropertiesSet();
//
//        // 配置具体的序列化方式
//        template.setKeySerializer(objectJackson2JsonRedisSerializer);
//
//    }
}
