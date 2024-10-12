package ms.user.yinn.Estudiante.repositorio;

import ms.user.yinn.Estudiante.entidad.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, String> {

    @Query(value = "SELECT DISTINCT e FROM Estudiante e WHERE e.codigo = ?1")
    List<Estudiante> findDistinctByCodigo(String codigo);

    @Query(value = "SELECT DISTINCT e FROM Estudiante e WHERE e.codigo = ?1 AND e.celular = ?2")
    List<Estudiante> findDistinctByCodigoAndCelular(String codigo, String celular);
}
