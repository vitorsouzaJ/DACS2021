package br.univille.vitorsouza.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.univille.vitorsouza.model.Produto;

@Service
public interface ProdutoService {
    public List<Produto> getAllProduto();
    public Produto save(Produto produto);
    
}
