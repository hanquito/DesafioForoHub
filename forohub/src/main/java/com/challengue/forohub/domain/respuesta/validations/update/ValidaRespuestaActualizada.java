package com.challengue.forohub.domain.respuesta.validations.update;

import com.challengue.forohub.domain.respuesta.dto.ActualizarRespuestaDTO;

public interface ValidaRespuestaActualizada {

   void validate(ActualizarRespuestaDTO data, Long respuestaId);
}
