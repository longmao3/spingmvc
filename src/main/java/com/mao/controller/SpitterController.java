package com.mao.controller;

import com.mao.pojo.Spitter;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/spitter")
public class SpitterController {

    @RequestMapping(value = "/registration",method = RequestMethod.GET)
    public String registration(){
        return "registrationForm";
    }

    @RequestMapping(value = "/registration",method = RequestMethod.POST)
    public String pressingRegistration(@Valid Spitter spitter, Errors errors){
        if (errors.hasErrors()){
            return "registrationForm";
        }
        System.out.println(spitter);
        return "registerSuccess";
    }

}
