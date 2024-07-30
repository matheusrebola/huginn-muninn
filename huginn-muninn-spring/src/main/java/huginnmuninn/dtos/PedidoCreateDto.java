package huginnmuninn.dtos;

import java.time.LocalDateTime;

import huginnmuninn.entities.Clientes;
import huginnmuninn.entities.StatusPedido;

public record PedidoCreateDto(
		LocalDateTime dataPedido,
		StatusPedido statusPedido,
		Integer total,
		Clientes cliente) {

}
