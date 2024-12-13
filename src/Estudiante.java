public class Estudiante extends ComunidadEPN {

    int codigo;
    String periodo_academico;
    String club;
    String aso;

    public Estudiante(String cedula, String nombre_completo, int edad, String direccion, String telefono, String correo, int codigo, String periodo_academico, String club, String aso) {
        super(cedula, nombre_completo, edad, direccion, telefono, correo);
        this.codigo = codigo;
        this.periodo_academico = periodo_academico;
        this.club = club;
        this.aso = aso;
    }

    // para que tenga alguna clase de inicializacion
    public Estudiante() {}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPeriodo_academico() {
        return periodo_academico;
    }

    public void setPeriodo_academico(String periodo_academico) {
        this.periodo_academico = periodo_academico;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getAso() {
        return aso;
    }

    public void setAso(String aso) {
        this.aso = aso;
    }
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Codigo Estudiante: " + this.codigo);
        System.out.println("Periodo academico: " + this.periodo_academico);
        System.out.println("Club: " + this.club);
        System.out.println("Aso: " + this.aso);
    }
}

