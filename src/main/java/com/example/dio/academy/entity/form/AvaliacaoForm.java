package com.example.dio.academy.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoForm {
    private long alunoId;
    private double peso;
    private double altura;
}
