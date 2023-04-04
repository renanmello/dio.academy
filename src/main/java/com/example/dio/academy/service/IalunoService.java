package com.example.dio.academy.service;

import com.example.dio.academy.entity.Aluno;
import com.example.dio.academy.entity.form.AlunoForm;
import com.example.dio.academy.entity.form.AlunoUpdateForm;

import java.util.List;

public interface IalunoService {
    Aluno create(AlunoForm form);

    Aluno get();

    List<Aluno> getAll();

    Aluno update(long id);

    void delete(Long id, AlunoUpdateForm formUpdate);
}
