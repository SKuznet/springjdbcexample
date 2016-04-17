package io.khasang.orgmanager.controller;

import io.khasang.orgmanager.model.DataSelect;
import io.khasang.orgmanager.model.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    @Autowired
    Hello hello;

    @Autowired
    DataSelect dataSelect;


    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("index", hello.getHello());
        return "index";
    }

    @RequestMapping("/createbase")
    public String createBase(Model model){
        model.addAttribute("createbase", dataSelect.getResult());
        return "createbase";
    }
}
