package com.mao.repository;

import com.mao.pojo.Spittle;
import java.util.List;

public interface SpittleRepository {
     List<Spittle> listLast(int max, int count);
}
