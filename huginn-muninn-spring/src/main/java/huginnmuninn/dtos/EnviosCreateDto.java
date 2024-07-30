package huginnmuninn.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import huginnmuninn.entities.Pedidos;
import huginnmuninn.entities.StatusEnvio;
import huginnmuninn.entities.Transportadoras;

public record EnviosCreateDto(
		LocalDateTime dataEnvio,
		Transportadoras transportadora,
		BigDecimal custoEnvio,
		StatusEnvio statusEnvio,
		Pedidos pedido) {

}
