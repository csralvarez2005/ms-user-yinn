package ms.user.yinn.Usuario.Repositorio;

import ms.user.yinn.Usuario.Entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {


    @Query(value = "SELECT usu.identificacion, usu.nombres, usu.apellidos FROM dbo.usuario usu WHERE usu.identificacion = :identificacion", nativeQuery = true)
    Optional<Usuario> buscarPorIdentificacion(@Param("identificacion") String identificacion);

}
