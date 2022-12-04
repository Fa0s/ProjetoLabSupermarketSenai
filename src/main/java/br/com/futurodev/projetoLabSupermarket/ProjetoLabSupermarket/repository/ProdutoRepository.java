package br.com.futurodev.projetoLabSupermarket.ProjetoLabSupermarket.repository;

import br.com.futurodev.projetoLabSupermarket.ProjetoLabSupermarket.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long> {
    boolean existsByNome(String nome);
}
