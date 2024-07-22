package br.org.gestao.huginnmuninn.entities;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record ItensPedidos(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		Integer quantidade,
		BigDecimal precoUnitario,
		BigDecimal subotal,
		Pedidos pedido,
		Produtos produto) {

}
