package com.study.web;

import com.study.web.mapper.mapper02.FriendsDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class WebApplicationTests {

    @Resource
    private FriendsDao friendsDao;

    @Test
    void contextLoads() {
//        Map selectbyid = friendsDao.selectbyid(1L);
        System.out.println();
        System.out.println("hello");
        System.out.println("hot-fix");
        System.out.println("master_01");
        System.out.println("hot-fix02");
    }

}
