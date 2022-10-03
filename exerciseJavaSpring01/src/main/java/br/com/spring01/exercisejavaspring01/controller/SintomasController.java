package br.com.spring01.exercisejavaspring01.controller;

import br.com.spring01.exercisejavaspring01.model.SintomaModel;
import br.com.spring01.exercisejavaspring01.service.ISintomas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/findSymptom")
public class SintomasController {
    @Autowired
    private ISintomas service;

    @GetMapping
    public ResponseEntity<List<SintomaModel>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<SintomaModel> getSintomaByName(@PathVariable String name){
        try {
            return new ResponseEntity<>(service.getSintomaByName(name), HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}
