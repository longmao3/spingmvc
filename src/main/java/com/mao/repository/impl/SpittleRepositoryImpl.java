package com.mao.repository.impl;

import com.mao.pojo.Spittle;
import com.mao.repository.SpittleRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class SpittleRepositoryImpl  implements SpittleRepository {
    @Override
    public List<Spittle> listLast(int max, int count) {
        List<Spittle> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(new Spittle(i+max,new Date()));
        }
        return list;
    }
}
