package com.mao.controller;

import com.mao.pojo.Spittle;
import com.mao.repository.impl.SpittleRepositoryImpl;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestSpittleController {

    @Test
    public void testSpittleList() throws Exception{
        SpittleController controller = new SpittleController(new SpittleRepositoryImpl());
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller)
                // 这里的视图/WEB-INF/jsp/.jsp 并不重要，只是为了防止spring将发送的String认为是路径。
                .setSingleView(
                        new InternalResourceView("/WEB-INF/jsp/.jsp")
                )
                .build();

        mockMvc.perform(MockMvcRequestBuilders.get("/spittles"))
                .andExpect(MockMvcResultMatchers.view().name("spittles"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("spittleList"));
    }

    private List<Spittle> createSpittleList(int count){
        List<Spittle> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(new Spittle(i,new Date()));
        }
        return list;
    }


}
