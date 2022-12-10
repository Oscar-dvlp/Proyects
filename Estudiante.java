public class Estudiante extends Persona {
    private String curso;

    public Estudiante(String nombre, String apellido , String identificacion, String estadocivil, String curso){
        super(nombre,apellido,identificacion,estadocivil);
        this.curso=curso; 
        
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
  

}