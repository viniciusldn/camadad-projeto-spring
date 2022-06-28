package com.trybe.camadas.projeto.spring.service;

import com.trybe.camadas.projeto.spring.persistence.entity.Estudante;
import com.trybe.camadas.projeto.spring.persistence.repository.EstudanteRepositoryImpl;
import java.util.Optional;

public class EstudanteServiceImpl implements EstudanteService {

  EstudanteRepositoryImpl estudanteRepositoryImpl;

  @Override
  public Estudante criarEstudante(Estudante estudante) {
    return estudanteRepositoryImpl.criarEstudante(estudante);
  }

  @Override
  public Optional<Estudante> buscaEstudantepeloId(String id) {
    return estudanteRepositoryImpl.buscaEstudantepeloId(id);
  }

  @Override
  public Estudante atualizaEstudantepeloId(String id, Estudante estudante) {
    return estudanteRepositoryImpl.atualizaEstudantepeloId(id, estudante);
  }

  @Override
  public void excluiEstudantepeloId(String id) {
    estudanteRepositoryImpl.excluiEstudantepeloId(id);
  }
}
