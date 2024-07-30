package huginnmuninn.dtos;

import java.math.BigDecimal;

import huginnmuninn.entities.Fornecedores;

public record ProdutoCreateDto(
		String nome,
		String descricao,
		BigDecimal preco,
		Integer quantidadeEstoque,
		Fornecedores fornecedor) {

}
