package ms.user.yinn.Dto;

public class EstudianteDTO {
    private String valor;
    private String codigo;
    private String nombreEstudiante;
    private String apellidoEstudiante;

    // Constructor
    public EstudianteDTO(String valor, String codigo, String nombreEstudiante, String apellidoEstudiante) {
        this.valor = valor;
        this.codigo = codigo;
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
    }

    // Getters y Setters
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

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
}
