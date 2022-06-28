package com.trybe.camadas.projeto.spring.persistence.repository;

import com.trybe.camadas.projeto.spring.persistence.entity.Estudante;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EstudanteRepositoryImpl implements EstudanteRepository {

  private List<Estudante> estudantes = new ArrayList<>();

  @Override
  public Estudante criarEstudante(Estudante estudante) {
    estudantes.add(estudante);
    return estudante;
  }

  @Override
  public Optional<Estudante> buscaEstudantepeloId(String id) {
    Optional<Estudante> estudante = estudantes.stream()
        .filter(e -> e.getId() == id).findFirst();
    return estudante;
  }

  @Override
  public Estudante atualizaEstudantepeloId(String id, Estudante estudante) {
    int index = estudantes.stream().map(e -> e.getId())
        .collect(Collectors.toList()).indexOf(id);
    if (index != -1) {
      estudantes.set(index, estudante);
    }
    return estudante;
  }

  @Override
  public void excluiEstudantepeloId(String id) {
    int index = estudantes.stream().map(e -> e.getId())
        .collect(Collectors.toList()).indexOf(id);
    if (index != -1) {
      estudantes.remove(index);
    }
  }
}
