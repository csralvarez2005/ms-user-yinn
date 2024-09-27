package ms.user.yinn.entidad;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Estudiante {

    private String codigo;
    private String nombreEstudiante;
    private String apellidoEstudiante;

    @ManyToOne
    @JoinColumn(name = "id_tipo_identificacion", referencedColumnName = "codigo")
    private ListaValor tipoIdentificacion;

    // Getters y Setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    public void setApellidoEstudiante(String apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
    }

    public ListaValor getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(ListaValor tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }
}
