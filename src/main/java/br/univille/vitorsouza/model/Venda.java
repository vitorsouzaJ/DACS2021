package br.univille.vitorsouza.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private float valorTotal;
    @Temporal(value = TemporalType.DATE)
    private Date data;
    @Column(length = 15)
    private String cupom;


    @OneToMany
    private List<ItemVenda> colItemVenda = new ArrayList<ItemVenda>();
    
    public List<ItemVenda> getColItemVenda() {
        return colItemVenda;
    }
    public void setColItemVenda(List<ItemVenda> colItemVenda) {
        this.colItemVenda = colItemVenda;
    }
    public String getCupom() {
        return cupom;
    }
    public void setCupom(String cupom) {
        this.cupom = cupom;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public float getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
   
    



    
}

