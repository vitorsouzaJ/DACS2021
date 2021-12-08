package br.univille.vitorsouza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.vitorsouza.model.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda,Long>{
    
}