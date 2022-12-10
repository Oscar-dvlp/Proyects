public class Persona {
    private String nombre;
    private String apellido;
    private String identificacion;
    private String estadocivil;



    @Override
    public String toString(){
        return   this.nombre + this.apellido + this.identificacion +this.estadocivil;
    }
    public Persona (String nombre, String apellido,String identificacion, String estadocivil){
        this.nombre=nombre;
        this.apellido=apellido;
        this.identificacion=identificacion;
        this.estadocivil=estadocivil;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getEstadocivil() {
        return estadocivil;
    }
    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }
    
    
}
