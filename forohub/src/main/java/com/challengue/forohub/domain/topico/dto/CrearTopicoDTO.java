package com.challengue.forohub.domain.topico.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CrearTopicoDTO(
        @NotBlank String titulo,
       @NotBlank String mensaje,
       @NotNull Long usuarioId,
       @NotNull Long cursoId
) {
}
