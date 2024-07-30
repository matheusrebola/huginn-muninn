package huginnmuninn.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import huginnmuninn.entities.Pedidos;
import huginnmuninn.entities.StatusEnvio;
import huginnmuninn.entities.Transportadoras;
import jakarta.validation.constraints.NotNull;

public record EnviosDto(
		@NotNull UUID id,
		LocalDateTime dataEnvio,
		Transportadoras transportadora,
		BigDecimal custoEnvio,
		StatusEnvio statusEnvio,
		Pedidos pedido) {
}
