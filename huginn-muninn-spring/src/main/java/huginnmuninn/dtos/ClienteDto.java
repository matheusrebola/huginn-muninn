package huginnmuninn.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record ClienteDto(
		@NotNull UUID id,
		String nome,
		String email,
		String telefone,
		String endereco) {
}
