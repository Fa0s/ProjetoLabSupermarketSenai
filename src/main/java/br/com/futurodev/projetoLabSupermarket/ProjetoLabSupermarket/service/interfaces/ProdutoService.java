package br.com.futurodev.projetoLabSupermarket.ProjetoLabSupermarket.service.interfaces;

import java.util.List;

import br.com.futurodev.projetoLabSupermarket.ProjetoLabSupermarket.model.Produto;

public interface ProdutoService extends Defalt<Produto>{

    List<Produto> listarByComprado();

    String totalCompra();
}
