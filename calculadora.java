import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);
         
        float num1,num2,operar;
        float residuo;
        String opcion = ""; 
        System.out.println("\nBienvenido Sr Usuari@ \n Esta calculadora le ofrece las siguientes operaciones\n Menu de opciones \nSuma \nResta\nMultiplicacion \nDivision \nDigite su opcion: +,-,*,/ "); 
       opcion = entrada.next();

       switch(opcion){
           case ("+"):
           System.out.println("Ingrese el primer numero : ");
            num1 = entrada.nextFloat();
          System.out.println("Ingrese el segundo numero : ");
            num2 = entrada.nextFloat();
            operar = num1+num2;
            System.out.println("La suma total es : "+operar); 
           break;
           
           case ("-"):
           System.out.println("Ingrese el primer numero : ");
            num1 = entrada.nextFloat();
          System.out.println("Ingrese el segundo numero : ");
            num2 = entrada.nextFloat();
            operar = num1-num2;
            System.out.println("La resta total es : "+operar);
           break;
             
            case ("*"):   
            System.out.println("Ingrese el primer numero : ");
            num1 = entrada.nextFloat();
          System.out.println("Ingrese el segundo numero : ");
            num2 = entrada.nextFloat();
             operar = num1*num2;
             System.out.println("La multiplicacion total es : "+operar);
            break;
               
            case ("/") :  
            System.out.println("Ingrese el primer numero : ");
            num1 = entrada.nextFloat();
          System.out.println("Ingrese el segundo numero : ");
            num2 = entrada.nextFloat();           
             operar = num1/num2; 
             residuo= num1%num2;
             System.out.println("El residuo es: "+residuo);
             System.out.println("La division total es : "+operar);
             
            break;    
            default : 		     
             System.out.println("ERROR \nRECUERDE: Solo se pueden digitar +,-,/,*: ");

       }  
   }
}
