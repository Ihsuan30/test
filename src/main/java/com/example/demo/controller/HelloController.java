package com.example.demo.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController

public class HelloController {
    @GetMapping(value = "/click/1")
    public LinkedHashMap<String, Object> hello() {

        LinkedHashMap<String, Object> map = new LinkedHashMap<>();

        int random=(int) (Math.random() * 100);
        map.put("dir", "1");
        map.put("values",random);

        System.out.println(map);


        return map;

    }
    @GetMapping(value ="/click/2")
    public LinkedHashMap<String, Object> click() {

        LinkedHashMap<String, Object> map = new LinkedHashMap<>();

        int random=(int) (Math.random() * 100);
        map.put("dir", "2");
        map.put("values",random);

        return map;

    }

}
