package com.jay.es.controller;

import com.jay.es.service.TitleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by xiang.wei on 2019/3/5
 *
 * @author xiang.wei
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class TitleControllerTest {
    @Autowired
    private TitleService titleService;
    @Test
    public void save() throws Exception {
        for (int i = 0; i < 20; i++) {
            titleService.save(Long.parseLong(String.valueOf(i)),"测试名称", "测试内容");
            System.out.println("插入第"+i+"条");
        }

    }

}