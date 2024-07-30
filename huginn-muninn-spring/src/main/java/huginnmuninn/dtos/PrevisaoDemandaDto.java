package huginnmuninn.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import huginnmuninn.entities.Produtos;
import jakarta.validation.constraints.NotNull;

public record PrevisaoDemandaDto(
		@NotNull UUID id,
		LocalDateTime dataPrevisao,
		Integer quantidadePrevista,
		Produtos produto) {

}
