package org.senac.Aula01.Repository;

import org.senac.Aula01.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    
} 
