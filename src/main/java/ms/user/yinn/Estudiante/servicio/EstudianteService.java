package ms.user.yinn.Estudiante.servicio;

import ms.user.yinn.Estudiante.entidad.Estudiante;

import java.util.List;

public interface EstudianteService {

    List<Estudiante> obtenerEstudiantesPorCodigo(String codigo);
    List<Estudiante> obtenerEstudiantesPorCodigoYCelular(String codigo, String celular);
}
