package br.univille.vitorsouza.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.vitorsouza.model.Fornecedor;
import br.univille.vitorsouza.repository.FornecedorRepository;
import br.univille.vitorsouza.service.FornecedorService;

@Service
public class FornecedorServiceImpl implements FornecedorService{
    
    @Autowired
    private FornecedorRepository repository;

    @Override
    public List<Fornecedor> getAllFornecedores() {
        return repository.findAll();
    }

    @Override
    public Fornecedor getFornecedor(long id) {
        return repository.getById(id);
    }
    
}