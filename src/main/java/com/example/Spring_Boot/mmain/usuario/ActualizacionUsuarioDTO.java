package com.example.Spring_Boot.mmain.usuario;

import jakarta.validation.constraints.NotNull;

public record ActualizacionUsuarioDTO(
        @NotNull Long id,
        String name,
        String email
) {
}