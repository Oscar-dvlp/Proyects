public class Personal extends Persona {
    private String seccionAsignada;
    
    public Personal (String nombre, String apellido,String identificacion, String estadocivil, String seccionAsignada )
    {
        super(nombre,apellido,identificacion,estadocivil);
        this.seccionAsignada=seccionAsignada;
        
    }

    public String getSeccionAsignada() {
        return seccionAsignada;
    }

    public void setSeccionAsignada(String seccionAsignada) {
        this.seccionAsignada = seccionAsignada;
    }
    
}
