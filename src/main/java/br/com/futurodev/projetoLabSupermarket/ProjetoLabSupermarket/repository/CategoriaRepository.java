package br.com.futurodev.projetoLabSupermarket.ProjetoLabSupermarket.repository;

import br.com.futurodev.projetoLabSupermarket.ProjetoLabSupermarket.model.Categoria;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long> {

    boolean existsByNome (String nome);
    Optional<Categoria> findByNome(String nome);
}
