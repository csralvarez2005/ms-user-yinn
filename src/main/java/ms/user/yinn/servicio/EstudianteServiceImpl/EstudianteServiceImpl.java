package ms.user.yinn.servicio.EstudianteServiceImpl;

import ms.user.yinn.Dto.EstudianteDTO;
import ms.user.yinn.entidad.Estudiante;
import ms.user.yinn.repositorio.EstudianteRepository;
import ms.user.yinn.servicio.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServiceImpl implements EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public EstudianteDTO obtenerEstudiantePorCodigo(String codigo) {
        Estudiante estudiante = estudianteRepository.findEstudianteByCodigo(codigo);
        if (estudiante != null) {
            // Mapear entidad a DTO
            return new EstudianteDTO(
                    estudiante.getTipoIdentificacion().getValor(),
                    estudiante.getCodigo(),
                    estudiante.getNombreEstudiante(),
                    estudiante.getApellidoEstudiante()
            );
        }
        return null;
    }
}
