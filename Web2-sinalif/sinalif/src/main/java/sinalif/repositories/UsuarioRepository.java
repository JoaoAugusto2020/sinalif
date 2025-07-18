package sinalif.repositories;

import java.util.Optional;

import sinalif.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findUserByEmail(String email);
}