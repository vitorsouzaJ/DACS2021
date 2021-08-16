package br.univille.vitorsouza.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.vitorsouza.model.Produto;
import br.univille.vitorsouza.repository.ProdutoRepository;
import br.univille.vitorsouza.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {


    @Autowired
    private ProdutoRepository repository;

    @Override
    public List<Produto> getAllProduto() {

        return repository.findAll();
    }

    @Override
    public Produto save(Produto produto) {
        return repository.save(produto);
    }

    @Override
    public void delete(Produto produto) {
       repository.delete(produto);
    }
    
}
