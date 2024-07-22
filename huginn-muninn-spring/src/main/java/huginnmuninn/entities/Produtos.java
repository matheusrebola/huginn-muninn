package br.org.gestao.huginnmuninn.entities;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Produtos(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String nome,
		String descricao,
		BigDecimal preco,
		Integer quantidadeEstoque,
		Fornecedores fornecedor) {
}
