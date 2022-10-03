package br.com.spring01.exercisejavaspring01.service;

import br.com.spring01.exercisejavaspring01.model.PessoaModel;
import br.com.spring01.exercisejavaspring01.repository.PessoaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService implements IPessoa{

    @Autowired
    PessoaRepo repo;

    @Override
    public List<PessoaModel> getPesssoasGrupoDeRisco() {
        return repo.getPesssoasGrupoDeRisco();
    }
}
