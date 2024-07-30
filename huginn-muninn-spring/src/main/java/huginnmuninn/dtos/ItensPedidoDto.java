package huginnmuninn.dtos;

import java.math.BigDecimal;
import java.util.UUID;

import huginnmuninn.entities.Pedidos;
import huginnmuninn.entities.Produtos;
import jakarta.validation.constraints.NotNull;

public record ItensPedidoDto(
		@NotNull UUID id,
		Integer quantidade,
		BigDecimal precoUnitario,
		BigDecimal subotal,
		Pedidos pedido,
		Produtos produto) {

}
