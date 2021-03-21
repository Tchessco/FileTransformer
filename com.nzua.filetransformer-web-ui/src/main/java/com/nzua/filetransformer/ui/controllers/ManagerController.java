package com.nzua.filetransformer.ui.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ManagerController {

    @GetMapping("/")
    public String index(
            @RequestParam(name="name", required=false, defaultValue="World") String name,
            Model model){

        model.addAttribute("name", name);

        return "index";
    }

    @GetMapping("/list")
    public String listProcess(
            @RequestParam(name="name", required=false, defaultValue="World") String name,
            Model model){

        Object model1 = model.getAttribute("main");

        return "index";
    }
}
