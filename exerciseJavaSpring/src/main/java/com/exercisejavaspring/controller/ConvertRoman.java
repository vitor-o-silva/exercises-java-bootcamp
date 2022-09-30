package com.exercisejavaspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class ConvertRoman {

    @GetMapping("/{numero}")
    public String convertNumber(@PathVariable String numero){
        Map<Integer, Character> listRoman = inicializador();
        return String.format("%s = %s",numero,listRoman.get(Integer.parseInt(numero)));
    }

    private Map<Integer, Character> inicializador(){
        Map<Integer,Character> listRoman = new HashMap<>();
        listRoman.put(1,'I');
        listRoman.put(5,'V');
        listRoman.put(10,'X');
        listRoman.put(50,'L');
        listRoman.put(100,'C');
        listRoman.put(500,'D');
        listRoman.put(1000,'M');
        return listRoman;
    }

}
