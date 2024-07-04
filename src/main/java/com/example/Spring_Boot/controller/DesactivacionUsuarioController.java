package com.example.Spring_Boot.controller;

import com.example.Spring_Boot.mmain.usuario.RegistroUsuarioDTO;
import com.example.Spring_Boot.mmain.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class DesactivacionUsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @DeleteMapping("/{id}/desactivar")
    public ResponseEntity<?> desactivarUsuario(@PathVariable Long id) {
        try {
            RegistroUsuarioDTO respuesta = usuarioService.desactivarUser(id);
            return ResponseEntity.ok(respuesta);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
