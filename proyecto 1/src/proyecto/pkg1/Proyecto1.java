/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.pkg1;
import java.util.Scanner;
/**
 *
 * @author ADRIAN
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        String nombre;
        int sexo;
        int edad;
        int deporte;
        double estatura;
        int suma = 0;
        int personasFutbol = 0;
        double promEdad = 0;
        System.out.println("Ingrese la cantidad de registros a procesar: ");
        n = teclado.nextInt();
       
        for(int i = 1; i<=n;i++){
            System.out.println("Ingrese su nombre: ");
            nombre = teclado.next();
            System.out.println("Ingrese su edad: ");
            edad = teclado.nextInt();
            System.out.println("Ingrese su estatura: ");
            estatura = teclado.nextDouble();
            System.out.println("Ingrese su sexo en nro (1 = hombre o 2= mujer): ");
            sexo = teclado.nextInt();
            System.out.println("Ingrese su deporte, solo el nro (1= natacion, 2=futbol, 3=ciclismo, 4=patinaje, 5= otro ): ");
            deporte = teclado.nextInt();
            if (deporte ==2){
                personasFutbol++;
                suma = suma + edad;
               
            }
           
           
        }
        promEdad = suma/personasFutbol;
        System.out.println("El promedio de edad de las personas que le gusta el futbol es: " + promEdad);
    }
    
}
