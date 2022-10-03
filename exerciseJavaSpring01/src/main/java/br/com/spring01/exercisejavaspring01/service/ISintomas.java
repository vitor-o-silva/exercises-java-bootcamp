package br.com.spring01.exercisejavaspring01.service;

import br.com.spring01.exercisejavaspring01.model.SintomaModel;

import java.io.FileNotFoundException;
import java.util.List;

public interface ISintomas {
    List<SintomaModel> getAll();
    SintomaModel getSintomaByName(String name) throws FileNotFoundException;
}
