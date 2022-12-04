package br.com.futurodev.projetoLabSupermarket.ProjetoLabSupermarket.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.futurodev.projetoLabSupermarket.ProjetoLabSupermarket.model.Produto;
import br.com.futurodev.projetoLabSupermarket.ProjetoLabSupermarket.repository.ProdutoRepository;
import br.com.futurodev.projetoLabSupermarket.ProjetoLabSupermarket.service.interfaces.ProdutoService;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;

@Service
public class ProdutoServiceImpl implements ProdutoService{

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public Produto salvar(Produto produto) {
        verificaNome(produto.getNome());
        return this.produtoRepository.save(produto);
    }

    @Override
    public Produto atualizar(Produto produto) {
        Produto produtoBuscado = buscar(produto.getId());

        if(Objects.nonNull(produto)){
            BeanUtils.copyProperties(produto, produtoBuscado, "id");
            verificaNome(produto.getNome());
            this.produtoRepository.save(produtoBuscado);
        }
        return null;
    }

    private void verificaNome(String nome) {
        if (this.produtoRepository.existsByNome(nome)) {
            throw new EntityExistsException("o produto "+nome+" já existe!");
        }
    }

    @Override
    public Produto buscar(Long id) {
        Optional<Produto> produtoBuscado = this.produtoRepository.findById(id);

        if(produtoBuscado.isEmpty()){
            throw new EntityNotFoundException("Não existe um produto com este id.");
        }
        return produtoBuscado.get();
    }

    @Override
    public List<Produto> listar() {
        return this.produtoRepository.findAll();
    }

    @Override
    public void deletar(Long id){
        this.produtoRepository.deleteById(id);
    }

    @Override
    public List<Produto> listarByComprado() {
        List<Produto> produtos = listar();
        List<Produto> produtosComprados = new ArrayList<Produto>();
         for (Produto produto: produtos){
            if(produto.getComprado() == true){
                produtosComprados .add(produto);
                
            }
            if(produtosComprados .size() <= 0){
                throw new EntityNotFoundException("Não existem produdos comprados!");
            }
        }
            return produtosComprados ;

    }
    
    @Override
    public String totalCompra() {
        List<Produto> produtosPagos = listarByComprado();
        Double total = 0.0;
        for(Produto produto: produtosPagos){
            total += produto.getValor();
        }
        String resultado = String.format("%.2f", total);
        
        return "o total é de "+resultado;
        }
}
