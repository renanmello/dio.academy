package com.example.dio.academy.entity;


import java.time.LocalDateTime;

public class AvaliacaoFisica {
    private long  id;
    private Aluno aluno;
    private LocalDateTime dataAvaliacao = LocalDateTime.now();
    private double peso;
    private double altura;
}
