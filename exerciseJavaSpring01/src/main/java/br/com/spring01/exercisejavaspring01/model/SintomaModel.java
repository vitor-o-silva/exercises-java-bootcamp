package br.com.spring01.exercisejavaspring01.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // Anotação para Gerar todos os getters
@Setter // Anotação para gerar todos os Setters
@NoArgsConstructor // Anotação para gerar um construtor sem parâmetros
@AllArgsConstructor // Anotação para gerar um construtor com todos os parâmetros
public class SintomaModel {
    private String codigo;
    private String nome;
    private String nivel_de_gravidade;
}
