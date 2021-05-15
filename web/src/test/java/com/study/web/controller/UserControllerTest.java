package com.study.web.controller;


import com.alibaba.fastjson.JSON;
import com.study.common.entity.User;
import com.study.web.mapper.mapper02.UserDao;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.annotation.Resource;

/**
 * 打莊測試
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest {

    @Resource
    private MockMvc mockMvc;

    @MockBean
    private UserDao userDao;

    @Test
    void selectOne() throws Exception {
        User user = new User(1,"zhansan","lisi","123456");
        userDaoDZ();
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/user/dos")
                .contentType(MediaType.APPLICATION_JSON)
                .content(JSON.toJSONString(user)))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
        Assert.assertEquals(200,mvcResult.getResponse().getStatus());
    }


//     打桩测试
    void userDaoDZ(){
//        Mockito.when(userDao.insert(Mockito.any())).thenReturn(2);
        BDDMockito.given(userDao.insert(BDDMockito.any())).willReturn(2);
    }
}