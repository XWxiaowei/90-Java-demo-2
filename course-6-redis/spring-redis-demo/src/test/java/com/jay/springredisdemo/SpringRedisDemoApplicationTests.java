package com.jay.springredisdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRedisDemoApplicationTests {
	@Autowired
	RedisTemplate redisTemplate;
	@Autowired
	RedisUtil redisUtil;

	@Test
	public void contextLoads() {
		redisUtil.set("xw111", "xiaowei");
		System.out.println(redisUtil.get("xw111"));
	}

}
