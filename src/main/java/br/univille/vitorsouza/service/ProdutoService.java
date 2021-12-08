package br.univille.vitorsouza.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.univille.vitorsouza.model.Fornecedor;
import br.univille.vitorsouza.model.Produto;

@Service
public interface ProdutoService {
    public List<Produto> getAllProdutos();
    public Produto save(Produto produto);
    public void delete(Produto produto);
    public List<Produto> importProduto(Fornecedor fornecedor);

}