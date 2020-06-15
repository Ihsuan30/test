package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController

public class HelloController {
    @GetMapping(value = "/click/1")
    public Map<String, Object> hello() {

        Map<String, Object> map = new HashMap<>();

        int random=(int) (Math.random() * 100);
        map.put("dir", "1");
        map.put("values",random);


        return map;

    }
    @GetMapping(value ="/click/2")
    public Map<String, Object> click() {

        Map<String, Object> map = new HashMap<>();

        int random=(int) (Math.random() * 100);
        map.put("dir", "1");
        map.put("values",random);

        return map;

    }

}
