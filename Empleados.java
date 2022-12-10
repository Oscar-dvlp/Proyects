public class Empleados extends Persona {
    String añoIncorporidad;
    int despacho;

    public Empleados (String nombre, String apellido,String identificacion, String estadocivil, String añoIncorporidad, int despacho )
    {
        super(nombre,apellido,identificacion,estadocivil);
        this.añoIncorporidad=añoIncorporidad;
        this.despacho=despacho;
       
    }

    public String getAñoIncorporidad() {
        return añoIncorporidad;
    }

    public void setAñoIncorporidad(String añoIncorporidad) {
        this.añoIncorporidad = añoIncorporidad;
    }

    public int getDespacho() {
        return despacho;
    }

    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }

}
