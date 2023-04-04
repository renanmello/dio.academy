package com.example.dio.academy.service;

import com.example.dio.academy.entity.AvaliacaoFisica;
import com.example.dio.academy.entity.form.AvaliacaoForm;
import com.example.dio.academy.entity.form.AvaliacaoUpdateForm;

import java.util.List;

public interface IavaliacaoFisicaService {
    AvaliacaoFisica create(AvaliacaoForm form);
    AvaliacaoFisica get(Long id);
    List<AvaliacaoFisica> getAll();
    AvaliacaoFisica update();
    void delete(long id, AvaliacaoUpdateForm updateForm);
}
