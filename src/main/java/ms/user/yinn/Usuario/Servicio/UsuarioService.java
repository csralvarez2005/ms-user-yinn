package ms.user.yinn.Usuario.Servicio;

import ms.user.yinn.Usuario.Entidad.Usuario;

import java.util.Optional;

public interface UsuarioService {

    Optional<Usuario> buscarPorIdentificacion(String identificacion);
}
