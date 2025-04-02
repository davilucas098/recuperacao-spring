package com.example.avaliacao_spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.avaliacao_spring.models.Aluno;
import com.example.avaliacao_spring.models.Pessoa;
import com.example.avaliacao_spring.models.Professor;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/v1/pessoas")
public class PessoaController {
    private final List<Pessoa> pessoas = new ArrayList<>();

    @PostMapping("/adicionar/aluno")
    public String adicionarAluno(@Valid @RequestBody Aluno aluno) {
        pessoas.add(aluno);
        return "Aluno adicionado com sucesso!";
    }

    @PostMapping("/adicionar/professor")
    public String adicionarProfessor(@Valid @RequestBody Professor professor) {
        pessoas.add(professor);
        return "Professor adicionado com sucesso!";
    }

    @GetMapping("/listar/alunos")
    public List<Pessoa> listarAlunos() {
        List<Pessoa> alunos = new ArrayList<>();
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Aluno) {
                alunos.add(pessoa);
            }
        }
        return alunos;
    }

    @GetMapping("/listar/professores")
    public List<Pessoa> listarProfessores(){
        List<Pessoa> professores = new ArrayList<>();
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Professor) {
                professores.add(pessoa);
            }
        }
        return professores;
    }
}