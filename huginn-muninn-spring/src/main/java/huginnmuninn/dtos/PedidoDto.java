package huginnmuninn.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import huginnmuninn.entities.Clientes;
import huginnmuninn.entities.StatusPedido;
import jakarta.validation.constraints.NotNull;

public record PedidoDto(
		@NotNull UUID id,
		LocalDateTime dataPedido,
		StatusPedido statusPedido,
		Integer total,
		Clientes cliente) {
}
