package br.com.spring01.exercisejavaspring01.service;

import br.com.spring01.exercisejavaspring01.model.SintomaModel;
import br.com.spring01.exercisejavaspring01.repository.SintomasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class SintomasService implements ISintomas {

    @Autowired // mesma coisa que instanciar o services no construtor
    private SintomasRepo repo;

    @Override
    public List<SintomaModel> getAll() {
        return repo.getAll();
    }

    @Override
    public SintomaModel getSintomaByName(String name) throws FileNotFoundException {
        Optional<SintomaModel> sintoma = repo.getSintomaByName(name);

        if (sintoma.isEmpty()){
            throw new FileNotFoundException("erro");
        };
        return sintoma.get();
    }
}
