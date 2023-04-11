package com.example.dio.academy.controller;

import com.example.dio.academy.entity.Aluno;
import com.example.dio.academy.entity.AvaliacaoFisica;
import com.example.dio.academy.entity.form.AlunoForm;
import com.example.dio.academy.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    public List<Aluno> getAll(){
        return service.getAll();

            }
    @PostMapping
    public Aluno create(@RequestBody AlunoForm form){
        return service.create(form);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisica(@PathVariable Long id){
        return service.getAllAvaliacaoFisica(id);
    }
}
