package ms.user.yinn.controlador;


import ms.user.yinn.Dto.EstudianteDTO;
import ms.user.yinn.servicio.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/{codigo}")
    public ResponseEntity<EstudianteDTO> obtenerEstudiantePorCodigo(@PathVariable String codigo) {
        EstudianteDTO estudianteDTO = estudianteService.obtenerEstudiantePorCodigo(codigo);
        if (estudianteDTO != null) {
            return ResponseEntity.ok(estudianteDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
