package com.example.dio.academy.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private long  id;
    private String nome;
    private String cpf;
    private String bairro;
    private LocalDate data_nascimento;
    private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

}
