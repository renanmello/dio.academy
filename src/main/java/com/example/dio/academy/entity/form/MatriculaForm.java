package com.example.dio.academy.entity.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaForm {
    @NotNull(message = "preencha o campo novamente")
    @Positive(message = "O id do aluno precisa ser positivo")
    private long alunoId;
}
