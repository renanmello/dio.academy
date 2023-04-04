package com.example.dio.academy.service;

import com.example.dio.academy.entity.Matricula;
import com.example.dio.academy.entity.form.MatriculaForm;

import java.util.List;

public interface ImatriculaService {
    Matricula create(MatriculaForm form);
    Matricula get(Long id);
    List<Matricula> getAll();
    void delete(long id);

}
