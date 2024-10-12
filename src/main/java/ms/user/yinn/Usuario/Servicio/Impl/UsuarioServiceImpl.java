package ms.user.yinn.Usuario.Servicio.Impl;

import ms.user.yinn.Usuario.Entidad.Usuario;
import ms.user.yinn.Usuario.Repositorio.UsuarioRepository;
import ms.user.yinn.Usuario.Servicio.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UsuarioServiceImpl implements UsuarioService {
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Optional<Usuario> buscarPorIdentificacion(String identificacion) {
        return usuarioRepository.buscarPorIdentificacion(identificacion);
    }
}
