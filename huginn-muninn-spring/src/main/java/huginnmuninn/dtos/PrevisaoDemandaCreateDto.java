package huginnmuninn.dtos;

import java.time.LocalDateTime;

import huginnmuninn.entities.Produtos;

public record PrevisaoDemandaCreateDto(
		LocalDateTime dataPrevisao,
		Integer quantidadePrevista,
		Produtos produto) {

}
