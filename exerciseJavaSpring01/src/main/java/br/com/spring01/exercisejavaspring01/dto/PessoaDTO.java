package br.com.spring01.exercisejavaspring01.dto;

import br.com.spring01.exercisejavaspring01.model.PessoaModel;
import lombok.Data;

@Data
public class PessoaDTO {
    private String nome;
    private String Sobrenome;

    public PessoaDTO(PessoaModel pessoa) {
        this.nome = pessoa.getNome();
        this.Sobrenome = pessoa.getSobrenome();
    }
}
