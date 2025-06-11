package dao;

import entity.Disciplina;

import java.util.List;

public interface DisciplinaDAO {
    void insert(Disciplina obj);

    void update(Disciplina obj);

    void deleteById(Integer id);

    Disciplina findById(Integer id);

    List<Disciplina> findAll();
}