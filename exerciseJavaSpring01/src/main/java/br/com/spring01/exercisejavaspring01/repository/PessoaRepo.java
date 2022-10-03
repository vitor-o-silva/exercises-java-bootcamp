package br.com.spring01.exercisejavaspring01.repository;

import br.com.spring01.exercisejavaspring01.model.PessoaModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class PessoaRepo {
    private final String linkFile = "src/main/resources/pessoas.json";
    ObjectMapper mapper = new ObjectMapper(); //transformar o json em objeto

    public List<PessoaModel> getPesssoasGrupoDeRisco(){
        List<PessoaModel> pessoas = null;
        try {
            pessoas = Arrays.asList(mapper.readValue(new File(linkFile), PessoaModel[].class));
        }catch (Exception ex) {

        }

        assert pessoas != null;
        return pessoas.stream().filter(p -> p.getIdade() > 60).collect(Collectors.toList());

    }
}
