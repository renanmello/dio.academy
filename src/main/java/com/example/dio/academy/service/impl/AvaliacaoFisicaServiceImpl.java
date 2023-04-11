package com.example.dio.academy.service.impl;

import com.example.dio.academy.entity.Aluno;
import com.example.dio.academy.entity.AvaliacaoFisica;
import com.example.dio.academy.entity.form.AvaliacaoForm;
import com.example.dio.academy.entity.form.AvaliacaoUpdateForm;
import com.example.dio.academy.repository.AlunoRepository;
import com.example.dio.academy.repository.AvaliacaoFisicaRepository;
import com.example.dio.academy.service.IavaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IavaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository repository;

    @Autowired
    private AlunoRepository alunoRepository;
    @Override
    public AvaliacaoFisica create(AvaliacaoForm form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());

        return repository.save(avaliacaoFisica);


    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return null;
    }

    @Override
    public AvaliacaoFisica update() {
        return null;
    }

    @Override
    public void delete(long id, AvaliacaoUpdateForm updateForm) {

    }
}
