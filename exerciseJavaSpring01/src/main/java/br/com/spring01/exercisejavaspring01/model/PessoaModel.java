package br.com.spring01.exercisejavaspring01.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter // Anotação para Gerar todos os getters
@Setter // Anotação para gerar todos os Setters
@NoArgsConstructor // Anotação para gerar um construtor sem parâmetros
@AllArgsConstructor // Anotação para gerar um construtor com todos os parâmetros
public class PessoaModel {
    private int id;
    private String nome;
    private String sobrenome;
    private int idade;
}
