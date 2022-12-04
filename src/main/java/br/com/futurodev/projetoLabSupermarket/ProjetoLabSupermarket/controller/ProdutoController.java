package br.com.futurodev.projetoLabSupermarket.ProjetoLabSupermarket.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.futurodev.projetoLabSupermarket.ProjetoLabSupermarket.model.Produto;
import br.com.futurodev.projetoLabSupermarket.ProjetoLabSupermarket.service.interfaces.CategoriaService;
import br.com.futurodev.projetoLabSupermarket.ProjetoLabSupermarket.service.interfaces.ProdutoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @Autowired CategoriaService categoriaService;

    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody @Valid Produto produto){
        return ResponseEntity.status(HttpStatus.CREATED).body(this.produtoService.salvar(produto));
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listar(){
        return ResponseEntity.ok(this.produtoService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable Long id ){
        return ResponseEntity.ok(this.produtoService.buscar(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizar(@RequestBody Produto produto){
        return ResponseEntity.ok(this.produtoService.atualizar(produto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        this.produtoService.deletar(id);
        return ResponseEntity
        .ok()
        .build();
    }

    @GetMapping("/total")
    public ResponseEntity<String> totalCompra(){
        return ResponseEntity.ok(this.produtoService.totalCompra());
    }

}
