package com.nzua.filetransformer.api.controllers;

import com.nzua.filetransformer.api.BaseRestContoller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProcessManagerController implements BaseRestContoller {

    @GetMapping("/getlistofprocess")
    public List<String> getListOfProcess(){
        return null;
    }

    @PostMapping("/submitprocess")
    public boolean submitProcess(){
        return false;
    }
}
