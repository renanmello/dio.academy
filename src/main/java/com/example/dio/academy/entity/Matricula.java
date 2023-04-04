package com.example.dio.academy.entity;

import java.time.LocalDateTime;

public class Matricula {
    private long id;
    private Aluno aluno;
    private LocalDateTime dataMatricula = LocalDateTime.now();
}
