package br.com.futurodev.projetoLabSupermarket.ProjetoLabSupermarket.service.interfaces;

import br.com.futurodev.projetoLabSupermarket.ProjetoLabSupermarket.model.Categoria;

public interface CategoriaService extends Defalt<Categoria> {
    Categoria buscarPeloNome(String nome);
}
