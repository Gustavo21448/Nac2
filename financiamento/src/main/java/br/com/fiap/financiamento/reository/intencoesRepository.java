package br.com.fiap.financiamento.reository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.produtos.mvc.entity.ProdutoEntity;

public interface intencoesRepository extends JpaRepository<ProdutoEntity, Long> {
   	
	
}
