package org.senac.Aula01.Controller;

import java.util.List;

import org.senac.Aula01.Model.Produto;
import org.senac.Aula01.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class ProdutoController {

    @Autowired //Injeta ja pronto na variavel
    private ProdutoRepository repository;

    @GetMapping
    public List<Produto> get(@RequestParam(required = false, defaultValue = "nome") String order, 
    @RequestParam(required = false, defaultValue = "asc") String direction, @RequestParam(required = false) String filtro)
    {     
        Sort s;
        Direction dir = Direction.fromString(direction);
        s = Sort.by(dir, order);
        if (filtro == null){
        return repository.findAll(s);
        }
        return repository.findByNomeContains(filtro, s);
    }
    @PostMapping   
    public Produto save(@RequestBody Produto produto){
        return repository.save(produto);
    }

    /*
    Postman : POST, raw, JSON
    INSERT
    {
    "nome": "Caneta",
    "descricao": "Caneta preta",
    "preco": 8.50,
    "url": ???
    }
    UPDATE
    {
    "id": 1,
    "nome": "Caneta X",
    "descricao": "Caneta preta",
    "preco": 8.50
    } 
    */













    
}
