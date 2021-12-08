package br.univille.vitorsouza.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.vitorsouza.model.Venda;
import br.univille.vitorsouza.repository.VendaRepository;
import br.univille.vitorsouza.service.VendaService;

@Service
public class VendaServiceImpl implements VendaService {

    @Autowired
    private VendaRepository repository;


    @Override
    public List<Venda> getAllVendas() {
        return repository.findAll();
    }

    @Override
    public Venda save(Venda venda) {
        return repository.save(venda);
    }

    @Override
    public void delete(Venda venda) {
        repository.delete(venda);
    }
    
}