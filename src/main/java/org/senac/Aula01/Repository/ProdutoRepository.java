package org.senac.Aula01.Repository;

import org.senac.Aula01.Model.Produto;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    List<Produto> findByNomeContains(String filtro, Sort s);
    
} 
