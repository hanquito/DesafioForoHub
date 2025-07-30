package com.challengue.forohub.domain.usuario.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AutenticacionUsuarioDTO(
        @JsonAlias("username") @NotBlank String username,
        @JsonAlias("password") @NotBlank String password) {
}
