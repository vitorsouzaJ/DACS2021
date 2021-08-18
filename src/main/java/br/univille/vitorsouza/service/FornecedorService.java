package br.univille.vitorsouza.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.univille.vitorsouza.model.Fornecedor;

@Service
public interface FornecedorService {
    public List<Fornecedor> getAllFornecedor();
    public Fornecedor save(Fornecedor fornecedor);

}
