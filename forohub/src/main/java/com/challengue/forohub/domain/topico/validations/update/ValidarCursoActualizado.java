package com.challengue.forohub.domain.topico.validations.update;


import com.challengue.forohub.domain.curso.repository.CursoRepository;
import com.challengue.forohub.domain.topico.dto.ActualizarTopicoDTO;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidarCursoActualizado implements ValidarTopicoActualizado {

    @Autowired
    private CursoRepository repository;

    @Override
    public void validate(ActualizarTopicoDTO data){
        if(data.cursoId() != null){
            var ExisteCurso =repository.existsById(data.cursoId());
            if(!ExisteCurso){
                throw new ValidationException("este curso no existe");
            }
            var cursoHabilitado = repository.findById(data.cursoId()).get().getActivo();

            if(!cursoHabilitado){
                throw new ValidationException("este curso no esta disponible en este momento");
            }
        }
    }

}
