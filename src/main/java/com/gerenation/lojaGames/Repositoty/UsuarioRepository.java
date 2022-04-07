package com.gerenation.lojaGames.Repositoty;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerenation.lojaGames.model.Usuario;

@Repository
public  interface UsuarioRepository  extends JpaRepository<Usuario, Long> {

    public Optional<Usuario> findByUsuario(String usuario);

    public Optional<Usuario> findByFoto(String foto);
}
