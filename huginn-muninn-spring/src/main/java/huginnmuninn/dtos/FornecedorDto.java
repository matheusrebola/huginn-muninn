package huginnmuninn.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record FornecedorDto(
		@NotNull UUID id,
		String nome,
		String contato,
		String endereco) {
}
