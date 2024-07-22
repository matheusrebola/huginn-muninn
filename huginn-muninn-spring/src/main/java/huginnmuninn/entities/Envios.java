package huginnmuninn.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Envios(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		LocalDateTime dataEnvio,
		Transportadoras transportadora,
		BigDecimal custoEnvio,
		StatusEnvio statusEnvio,
		Pedidos pedido) {
}
