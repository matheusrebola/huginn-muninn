package huginnmuninn.dtos;

import java.math.BigDecimal;

import huginnmuninn.entities.Pedidos;
import huginnmuninn.entities.Produtos;

public record ItensPedidoCreateDto(
		Integer quantidade,
		BigDecimal precoUnitario,
		BigDecimal subotal,
		Pedidos pedido,
		Produtos produto) {

}
