package com.mao.controller;

import com.mao.pojo.Spittle;
import com.mao.repository.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class SpittleController {

    private SpittleRepository repository;

    @Autowired
    public SpittleController(SpittleRepository repository){
        this.repository = repository;
    }

    @RequestMapping(value = "/spittles",method = RequestMethod.GET)
    public String getSpittleList(Model model){
        List<Spittle> spittleList = repository.listLast(20,10);
        model.addAttribute("spittleList",spittleList);
        return "spittles";

    }

}
