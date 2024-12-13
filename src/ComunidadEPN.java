public class ComunidadEPN {
    String cedula;
    String nombre_completo;
    int edad;
    String direccion;
    String telefono;
    String correo;

    public ComunidadEPN() { }

    public ComunidadEPN(String cedula, String nombre_completo, int edad, String direccion, String telefono, String correo) {
        this.cedula = cedula;
        this.nombre_completo = nombre_completo;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void mostrarDatos(){
        System.out.println("Cedula: " + this.cedula);
        System.out.println("Nombre completo: " + this.nombre_completo);
        System.out.println("Edad: " + this.edad);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Correo: " + this.correo);
    }
    public String mostrarDatos2(){
        String resultado="Cedula: " + this.cedula
        + "Nombre completo: " + this.nombre_completo
        + "Edad: " + this.edad
        + "Direccion: " + this.direccion
        + "Telefono: " + this.telefono
        + "Correo: " + this.correo;
        return resultado;

    }


}
