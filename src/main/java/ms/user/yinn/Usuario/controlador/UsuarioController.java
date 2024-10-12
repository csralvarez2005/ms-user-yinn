package ms.user.yinn.Usuario.controlador;

import ms.user.yinn.Usuario.Entidad.Usuario;
import ms.user.yinn.Usuario.Servicio.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    // Endpoint para obtener un usuario por su identificación
    @GetMapping("/{identificacion}")
    public ResponseEntity<Usuario> obtenerUsuarioPorIdentificacion(@PathVariable String identificacion) {
        Optional<Usuario> usuario = usuarioService.buscarPorIdentificacion(identificacion);
        return usuario.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
