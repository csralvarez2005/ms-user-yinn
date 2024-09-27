package ms.user.yinn.servicio;

import ms.user.yinn.Dto.EstudianteDTO;

public interface EstudianteService {
    EstudianteDTO obtenerEstudiantePorCodigo(String codigo);
}
