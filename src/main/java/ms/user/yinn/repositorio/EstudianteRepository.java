package ms.user.yinn.repositorio;

import ms.user.yinn.entidad.Estudiante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends CrudRepository<Estudiante, String> {

    @Query("SELECT e FROM Estudiante e JOIN e.tipoIdentificacion lv WHERE e.codigo = :codigo")
    Estudiante findEstudianteByCodigo(String codigo);
}
