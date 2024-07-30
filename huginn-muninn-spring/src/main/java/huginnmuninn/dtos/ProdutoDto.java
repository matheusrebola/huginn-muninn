package huginnmuninn.dtos;

import java.math.BigDecimal;
import java.util.UUID;

import huginnmuninn.entities.Fornecedores;
import jakarta.validation.constraints.NotNull;

public record ProdutoDto(
		@NotNull UUID id,
		String nome,
		String descricao,
		BigDecimal preco,
		Integer quantidadeEstoque,
		Fornecedores fornecedor) {
}
