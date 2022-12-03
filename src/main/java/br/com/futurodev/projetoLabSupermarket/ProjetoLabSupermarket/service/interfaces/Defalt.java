package br.com.futurodev.projetoLabSupermarket.ProjetoLabSupermarket.service.interfaces;

import java.util.List;

public interface Defalt<T>{

    T salvar(T object);
    T atualizar(T object);
    T buscar(Long id);
    List<T> listar();
    void deletar(Long id);

}
