package ms.user.yinn.Estudiante.servicio.Impl;

import ms.user.yinn.Estudiante.entidad.Estudiante;
import ms.user.yinn.Estudiante.repositorio.EstudianteRepository;
import ms.user.yinn.Estudiante.servicio.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public List<Estudiante> obtenerEstudiantesPorCodigo(String codigo) {
        return estudianteRepository.findDistinctByCodigo(codigo);
    }

    @Override
    public List<Estudiante> obtenerEstudiantesPorCodigoYCelular(String codigo, String celular) {
        return estudianteRepository.findDistinctByCodigoAndCelular(codigo, celular);
    }


}
