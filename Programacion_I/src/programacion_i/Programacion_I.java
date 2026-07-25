/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion_i;

/**
 *
 * @author cmu08_12mttuz
 */
public class Programacion_I {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola... como estas");
        System.out.println("Este es mi primer programa");
        System.out.println("Yujuuu... estoy con java");
        
        System.out.print("Carlos Alberto Murillo");
        System.out.print(" Docente");
        System.out.print(" Mucho Gusto");
        System.out.println("");
        
        System.out.printf("Esta es la clase de %S \n","Programacion");
        System.out.printf("Esta es %S la clase de \n" ,"Programacion");
        System.out.printf("%S Esta es la clase de \n","Programacion");
        
        System.out.printf("Hola \n como \n estas \n en la clase %s\n", "Programacion");
        System.out.printf("Hola \t como \t estas \t en la clase %s\t", "Programacion");
        
        //variables
        int tiempo; //Tipo entero
        double promedio; //Tipo decimal
        String nombre; //Tipo cadena
        char inicial; //Tipo caracter -> letra, digitoNumerico, simbolo Especial
        boolean estado; //Tipo Booleano
        
        tiempo = 3;
        nombre = "Carlos";
        inicial = 'C';
        
        System.out.println("");        
        System.out.printf("Tu nombre es: %s \n",nombre); //%s String
        System.out.printf("%d veces de la semana recibes la clase \n",tiempo); //%d Decimal
        System.out.printf("Te llamare %c inicial \n",inicial); //%c Caracter , para booleano se utiliza %d y para booleano %f
        
        
        
        
                
    }//Fin de la funcion MAIN
    
}// Fin de la clase programacion_i
