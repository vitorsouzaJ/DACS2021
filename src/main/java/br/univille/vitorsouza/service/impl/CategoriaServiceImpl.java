package br.univille.vitorsouza.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.vitorsouza.model.Categoria;
import br.univille.vitorsouza.repository.CategoriaRepository;
import br.univille.vitorsouza.service.CategoriaService;

/***
 * CategoriaServiceImpl representa a implementação da lógica
 * de negócio da aplicação para a entidade Categoria, por
 * isso faz uso do repositório para persistir os dados.
 */
@Service
public class CategoriaServiceImpl implements CategoriaService {
    
    @Autowired
    private CategoriaRepository repository;
    
    @Override
    public List<Categoria> getAllCategorias() {
        return repository.findAll();
    }

    @Override
    public Categoria save(Categoria categoria) {
        return repository.save(categoria);
    }

    @Override
    public void delete(Categoria categoria) {
        repository.delete(categoria);
    }
}