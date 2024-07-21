package br.org.gestao.huginnmuninn.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Fornecedores(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String nome,
		String contato,
		String endereco) {
}
