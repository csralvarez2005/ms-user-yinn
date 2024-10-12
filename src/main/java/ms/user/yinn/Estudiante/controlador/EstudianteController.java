package ms.user.yinn.Estudiante.controlador;

import ms.user.yinn.Estudiante.entidad.Estudiante;
import ms.user.yinn.Estudiante.servicio.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/api/estudiantes/{codigo}")
    public List<Estudiante> obtenerEstudiantesPorCodigo(@PathVariable String codigo) {
        return estudianteService.obtenerEstudiantesPorCodigo(codigo);
    }

    @GetMapping("/api/estudiantes/{codigo}/{celular}")
    public List<Estudiante> obtenerEstudiantesPorCodigoYCelular(@PathVariable String codigo, @PathVariable String celular) {
        return estudianteService.obtenerEstudiantesPorCodigoYCelular(codigo, celular);
    }
}
