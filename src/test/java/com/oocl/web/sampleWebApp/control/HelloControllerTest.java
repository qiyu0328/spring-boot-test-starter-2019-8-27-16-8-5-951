/*
 * Copyright (C), 1992-2019
 * Package com.oocl.web.sampleWebApp 
 * FileName: HomeControllerTest.java
 * Author:   wang-hc
 * Date:     2019年8月28日 下午4:21:07
 * Description: //模块目的、功能描述      
 * History: //修改记录
 *===============================================================================================
 *   author：          time：                             version：           desc：
 *   wang-hc           2019年8月28日下午4:21:07                     1.0                  
 *===============================================================================================
 */
package com.oocl.web.sampleWebApp;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello World")));
    }
    
    @Test
    public void shouldGetBadRequest() throws Exception {
        this.mockMvc.perform(get("/hello")).andDo(print()).andExpect(status().isBa
    }
    
    @Test
    public void shouldGotGneratedIdInBody() throws Exception
    MashMap map=new HashMap();
    String postString=objectMapper.writeValue
    
    		this.mockMvc.perform(
    				MockMvcRequestBuilders
    				.post("/users")
    				.contentType(MediaType.APPLICATION.
    				.content(postString)
}
.andDo(print())
.andExpect()status().isOk()
    		
        		