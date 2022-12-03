package br.com.futurodev.projetoLabSupermarket.ProjetoLabSupermarket.service;

import br.com.futurodev.projetoLabSupermarket.ProjetoLabSupermarket.model.Categoria;
import br.com.futurodev.projetoLabSupermarket.ProjetoLabSupermarket.repository.CategoriaRepository;
import br.com.futurodev.projetoLabSupermarket.ProjetoLabSupermarket.service.interfaces.CategoriaService;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

@Autowired
private CategoriaRepository categoriaRepository;

 

    @Override
    public Categoria salvar(Categoria categoria) {
        String nome = categoria.getNome().toUpperCase();
        VerificaNome(nome);
        categoria.setNome(nome);
        return this.categoriaRepository.save(categoria);
    }

    @Override
    public Categoria atualizar(Categoria categoria) {
        Categoria categoriaPesquisada  = buscar(categoria.getId());
        
        if(Objects.nonNull(categoria)){
            BeanUtils.copyProperties(categoria, categoriaPesquisada, "id");
            VerificaNome(categoriaPesquisada.getNome().toUpperCase());
            this.categoriaRepository.save(categoria);
        }

        return null;
    }

    private void VerificaNome(String nome) {
            if (this.categoriaRepository.existsByNome(nome)) {
                throw new EntityExistsException("A Categoria "+nome+" já existe!!");
            }
        }

    @Override
    public Categoria buscar(Long id) {
        Optional<Categoria> categoriaPesquisada = this.categoriaRepository.findById(id);
        if(categoriaPesquisada.isEmpty()){
            throw new EntityNotFoundException("A categoria "+id+" Não foi encontrada!");
        }
        return categoriaPesquisada.get();
    }

    @Override
    public Categoria buscarPeloNome(String nome){
        Optional<Categoria> categoriaPesquisada = this.categoriaRepository.findByNome(nome);
        if(categoriaPesquisada.isEmpty()){
            throw new EntityNotFoundException("A categoria "+nome+" Não foi encontada!");
        }
        return categoriaPesquisada.get();
    }

    @Override
    public List<Categoria> listar() {
        return this.categoriaRepository.findAll();
    }

    @Override
    public void deletar(Long id) {
        this.categoriaRepository.deleteById(id);
    }
}
