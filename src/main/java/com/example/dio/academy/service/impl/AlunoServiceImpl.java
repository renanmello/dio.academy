package com.example.dio.academy.service.impl;

import com.example.dio.academy.entity.Aluno;
import com.example.dio.academy.entity.AvaliacaoFisica;
import com.example.dio.academy.entity.form.AlunoForm;
import com.example.dio.academy.entity.form.AlunoUpdateForm;
import com.example.dio.academy.repository.AlunoRepository;
import com.example.dio.academy.service.IalunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AlunoServiceImpl implements IalunoService {

    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setData_nascimento(form.getData_nascimento());
        return repository.save(aluno);

    }

    @Override
    public Aluno get() {
        return null;
    }

    @Override
    public List<Aluno> getAll() {
        return repository.findAll();
    }

    @Override
    public Aluno update(long id) {
        return null;
    }

    @Override
    public void delete(Long id, AlunoUpdateForm formUpdate) {

    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisica(Long id) {
    Aluno aluno = repository.findById(id).get();

    return aluno.getAvaliacoes();

    }
}
