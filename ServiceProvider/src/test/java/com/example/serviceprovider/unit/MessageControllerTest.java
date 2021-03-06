package com.example.serviceprovider.unit;

import com.example.serviceprovider.config.ApplicationContextConfig;
import com.example.serviceprovider.controller.MessageController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MessageController.class)
public class MessageControllerTest {

    @Autowired
    MockMvc mockMvc;
    @MockBean
    ApplicationContextConfig applicationContextConfig;

    @Test
    public void getMessage() throws Exception{
        String expected = "Hello from service provider!";

        when(applicationContextConfig.getMessage()).thenReturn(expected);
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/message")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        assertEquals(expected,mvcResult.getResponse().getContentAsString());
    }
}
