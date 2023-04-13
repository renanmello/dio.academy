package com.example.dio.academy.entity.form;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

    @NotBlank(message = "Digite novamente")
    @Size(min = 3 , max = 50 , message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres")
    private String nome;

    @NotBlank(message = "Digite novamente")
    @CPF(message = "'${validatedValue}' é inválido")
    private String cpf;

    @NotBlank
    @Size(min = 3 , max = 50 , message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres")
    private String bairro;

    @NotBlank(message = "Digite novamente")
    @Past(message = "'${validatedValue}' data invalida")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate data_nascimento;

}
