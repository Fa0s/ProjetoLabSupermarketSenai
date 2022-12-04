package br.com.futurodev.projetoLabSupermarket.ProjetoLabSupermarket.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Categoria categoria;

    @NotNull
    private String nome;

    @NotNull
    private double valor;

    @NotNull
    private Boolean comprado;
}
