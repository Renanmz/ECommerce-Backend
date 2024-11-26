package org.senac.Aula01.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //auto increment
    private Integer id;

    @Column(nullable = false, length = 100) // not null varchar(100)
    private String nome;

    @Column(name = "description", length = 255) //varchar(255)
    private String descricao;
    
    @Column(name = "URLIMG", length = 2048) //varchar(2048)
    private String url;

    
    private Double preco;

    public Integer getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getURL() {
        return url;
    }
    public Double getPreco() {
        return preco;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setURL(String url) {
        this.url = url;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }

}
