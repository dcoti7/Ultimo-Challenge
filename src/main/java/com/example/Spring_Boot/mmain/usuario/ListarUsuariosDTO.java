package com.example.Spring_Boot.mmain.usuario;

public record ListarUsuariosDTO (
        Long id,
        String name,
        String email
){
    public ListarUsuariosDTO(Usuario usuario){

        this(usuario.getId(),usuario.getName(),usuario.getEmail());
    }
}