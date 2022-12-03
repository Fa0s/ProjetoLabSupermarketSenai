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
import br.com.futurodev.projetoLabSupermarket.ProjetoLabSupermarket.model.Categoria;
import br.com.futurodev.projetoLabSupermarket.ProjetoLabSupermarket.service.interfaces.CategoriaService;
import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;
    
    @PostMapping
    public ResponseEntity<Categoria> salvar(@RequestBody @Valid Categoria categoria){
        return ResponseEntity
        .status(HttpStatus.OK)
        .body(this.categoriaService
        .salvar(categoria));
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> listar(){
        return ResponseEntity
        .ok(this.categoriaService.listar());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Categoria> buscarPorId(@PathVariable Long id){
        return ResponseEntity
        .ok(this.categoriaService.buscar(id));
    }

    @GetMapping("/buscar-categoria")
    public ResponseEntity<Categoria> buscarPeloNome(@PathParam("nome") String nome){
        return ResponseEntity
        .ok(this.categoriaService.buscarPeloNome(nome));
    }

    @PutMapping
    public ResponseEntity<Categoria> atualizar(@RequestBody @Valid Categoria categoria){
        return ResponseEntity
        .ok(this.categoriaService.atualizar(categoria));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        this.categoriaService.deletar(id);
        return ResponseEntity
        .ok()
        .build();
    }
}
