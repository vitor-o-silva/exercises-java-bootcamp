package br.com.spring01.exercisejavaspring01.repository;

import br.com.spring01.exercisejavaspring01.model.SintomaModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class SintomasRepo {
    private final String linkFile = "src/main/resources/sintomas.json"; // path para o arquivo JSON
    ObjectMapper mapper = new ObjectMapper(); //transformar o json em objeto

    public List<SintomaModel> getAll(){
        List<SintomaModel> sintomas = null;
        try {
            sintomas = Arrays.asList(mapper.readValue(new File(linkFile), SintomaModel[].class));
        }catch (Exception ex) {

        }
        return sintomas;
    }

    public Optional<SintomaModel> getSintomaByName(String name){
        List<SintomaModel> sintomas = this.getAll();
        Optional<SintomaModel> sintoma = sintomas.stream()
                .filter(s-> s.getNome().equals(name))
                .findFirst();
        if (sintoma.isEmpty()){
            return Optional.empty();
        }
        return sintoma;
    }
}
