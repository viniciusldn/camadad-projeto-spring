package com.trybe.camadas.projeto.spring.service;

import com.trybe.camadas.projeto.spring.persistence.entity.Estudante;
import java.util.Optional;

public interface EstudanteService {
  public Estudante criarEstudante(Estudante estudante);

  public Optional<Estudante> buscaEstudantepeloId(String id);

  public Estudante atualizaEstudantepeloId(String id, Estudante estudante);

  public void excluiEstudantepeloId(String id);
}
