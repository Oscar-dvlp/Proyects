public class Profesores extends Persona {
    String departamento;

    public Profesores(String nombre, String apellido,String identificacion, String estadocivil, String departamento )
    {   
        super(nombre,apellido,identificacion,estadocivil);
        this.departamento=departamento;
        
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
