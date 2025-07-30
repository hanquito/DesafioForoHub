package com.challengue.forohub.domain.topico.dto;

import com.challengue.forohub.domain.topico.Estado;

public record ActualizarTopicoDTO(
        String titulo,
        String mensaje,
        Estado estado,
        Long cursoId
) {
}
