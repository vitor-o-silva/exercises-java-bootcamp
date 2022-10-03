package br.com.spring01.exercisejavaspring01.controller;

import br.com.spring01.exercisejavaspring01.dto.PessoaDTO;
import br.com.spring01.exercisejavaspring01.model.PessoaModel;
import br.com.spring01.exercisejavaspring01.service.IPessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/findRiskPerson")
public class PessoaController {

    @Autowired
    private IPessoa service;

    @GetMapping
    public ResponseEntity<List<PessoaDTO>> getPessoasGrupoRisco(){
        List<PessoaModel> pessoaRisco = service.getPesssoasGrupoDeRisco();
        List<PessoaDTO> pessoaDTO = pessoaRisco.stream().map(PessoaDTO::new).collect(Collectors.toList());
        return new ResponseEntity<>(pessoaDTO, HttpStatus.OK);
    }
}
