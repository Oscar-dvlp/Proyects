import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int opcion = 0;
        String nAño;
        int nDespacho;
        String nCurso;
        String nSeccion;
        String nDepartamento;

        Scanner leer = new Scanner(System.in);
       Empleados empleado = new Empleados(" Jesus ",  " Gómez ", " 5464654 ", " Soltero ", " 2013 ", 3);
       System.out.println("El empleado: " +empleado +" Incorporado en el año"+ empleado.getAñoIncorporidad() + " Con número de despacho " 
       + empleado.getDespacho());
       Estudiante estudiante = new Estudiante(" Roberto ", " Ruiz ", " 7894646 ", " Soltero ", " 2B ");
       System.out.println(" El estudiante: " +estudiante +" Perteneciente al curso "+estudiante.getCurso());
       Personal personalServicio = new Personal(" Jose ", " Gutierrez ", " 6564897 ", " Casado ", " Secretaria ");
       System.out.println(" El personal de servicio:  " +personalServicio + " Asignado a la sección de "+personalServicio.getApellido() );
       Profesores profesor = new Profesores(" Sara ", " Rodriguez ", " 1324651 ", " Casada ", " Ciencias ");
       System.out.println(" La profesora: " +profesor  +" Pertenece al departamento de " + profesor.getDepartamento());
       System.out.println("\t Elja que dato desea cambiar");
        System.out.println("\t1. Año Incorporidad");
        System.out.println("\t2. Número de despacho");
        System.out.println("\t3. Curso");
        System.out.println("\t4. Sección Asignada");
        System.out.println("\t5. Departamento");
        System.out.println("Elija el dato que quiere cambiar");
        opcion=leer.nextInt();

       switch (opcion) {
        case 1:
            System.out.println("Inserte el nuevo año de Incorporidad");
            nAño=leer.next();
            empleado.setAñoIncorporidad(nAño);
            System.out.println("El año de incorporidad ha cambiado");
            System.out.println("El empleado " +empleado.getNombre() +empleado.getApellido() +" Incorporado en el año " +empleado.getAñoIncorporidad() +
            " Con número de identificacion " +empleado.getIdentificacion()+ " su estado civil es "+empleado.getEstadocivil() +
            " con número de despacho " +empleado.getDespacho());
            System.out.println(" El estudiante: " +estudiante +" Perteneciente al curso "+estudiante.getCurso());
            System.out.println(" El personal de servicio:  " +personalServicio + " Asignado a la sección de "+personalServicio.getApellido() );
            System.out.println(" La profesora: " +profesor  +" Pertenece al departamento de " + profesor.getDepartamento());
           
            break;
        case 2:
            System.out.println("Inserte el nuevo numero de despacho");
                nDespacho=leer.nextInt();
             empleado.setDespacho(nDespacho);
             System.out.println("número de despacho ha cambiado");
             System.out.println("El empleado " +empleado.getNombre() +empleado.getApellido() +" Incorporado en el año " +empleado.getAñoIncorporidad() +
             " Con número de identificacion " +empleado.getIdentificacion()+ " su estado civil es "+empleado.getEstadocivil()+" con número de despacho " +
             empleado.getDespacho());
             System.out.println("El estudiante: " +estudiante +" Perteneciente al curso "+estudiante.getCurso());
             System.out.println("El personal de servicio:  " +personalServicio + " Asignado a la sección de "+personalServicio.getApellido() );
             System.out.println("La profesora: " +profesor  +" Pertenece al departamento de " + profesor.getDepartamento());

            
            break;
        case 3:
             System.out.println("Inserte el nuevo curso del estudiante");
                nCurso=leer.next();
                estudiante.setCurso(nCurso);
             System.out.println("El curso del estudiante ha cambiado");
             System.out.println("El estudiante " +estudiante.getNombre() +estudiante.getApellido() + " perteneciente al curso "+ 
             estudiante.getCurso() +" Con número de identificacion " +estudiante.getIdentificacion()+" su estado civil es " +estudiante.getEstadocivil());
             System.out.println("El empleado: " +empleado +" Incorporado en el año"+ empleado.getAñoIncorporidad() + " Con número de despacho " 
             + empleado.getDespacho());
             System.out.println("El personal de servicio:  " +personalServicio + " Asignado a la sección de "+personalServicio.getApellido() );
             System.out.println("La profesora: " +profesor  +" Pertenece al departamento de " + profesor.getDepartamento());

           
            break;
        case 4:
           
            System.out.println("Inserte la nueva sección del personal");
                nSeccion=leer.next();
                personalServicio.setSeccionAsignada(nSeccion);
             System.out.println("La sección ha cambiado");
             System.out.println("El personal de servicio " +personalServicio.getNombre() +personalServicio.getApellido() +" Incorporado en el año " +empleado.getAñoIncorporidad() +
             " Con número de identificacion " +personalServicio.getIdentificacion()+ " su estado civil " +personalServicio.getEstadocivil() + " asignado a la seccion de " +
             personalServicio.getSeccionAsignada());
             System.out.println("El empleado: " +empleado +" Incorporado en el año"+ empleado.getAñoIncorporidad() + " Con número de despacho " 
             + empleado.getDespacho());
             System.out.println("El estudiante: " +estudiante +" Perteneciente al curso "+estudiante.getCurso());
             System.out.println("La profesora: " +profesor  +" Pertenece al departamento de " + profesor.getDepartamento());
           
            break;
        case 5:
            System.out.println("Inserte el nuevo departamento del profesor");
            nDepartamento=leer.next();
           profesor.setDepartamento(nDepartamento);
           System.out.println("El departamento del profesor ha cambiado");
           System.out.println("La profesora " +profesor.getNombre() +profesor.getApellido() + " Con número de identificacion " +
           profesor.getIdentificacion()+ " su estado civil " +profesor.getEstadocivil() + " perteneciente al departamento de " +
             profesor.getDepartamento());
             System.out.println("El empleado: " +empleado +" Incorporado en el año"+ empleado.getAñoIncorporidad() + " Con número de despacho ");
             System.out.println("El estudiante: " +estudiante +" Perteneciente al curso "+estudiante.getCurso());
             System.out.println("El personal de servicio:  " +personalServicio + " Asignado a la sección de "+personalServicio.getApellido() );

            break;
        default:

            break;
    }
   
      
       
    }
}
