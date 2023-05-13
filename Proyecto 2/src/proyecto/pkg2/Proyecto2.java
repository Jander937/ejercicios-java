/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.pkg2;
import java.util.Scanner;
/**
 *
 Programa que calcule la tarifa basica de servicios de una n cantidad de usuarios de acuerdo
 * a su estrato, se debe pedir por cada usuario su numero de documento y para poder calcular su
 * tarifa esta debe estar en estado Activo, si esta en estado suspendido su tarifa es cero
 * tarifa basica segun estrato se asigna asi:
 * estrato 1 10000
 * estrato 2 15000
 * estrato 3 30000
 * estrato 4 50000
 * estrato 5 65000
 * 
 * se debe mostrar el total general de tarifas
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        char estado;
        double tarifaBasica = 0;
        double tarifaTotal = 0;
        int documento;
        int estrato;
        
        System.out.println("ingrese cantida de usuarios ");
        n = teclado.nextInt();
        for (int i = 1; i<=n;i++){
            System.out.println("ingrese el documento ");
        documento = teclado.nextInt();
            System.out.println("digite el estado (A: activo or S: suspendido)");
        estado = teclado.next().charAt(0);
            System.out.println("digite el estrato (1 2 3 4 5) ");
            estrato = teclado.nextInt();
            if (estado == 's' ){
            tarifaBasica = 0;
            }else{
            switch (estrato ){
                case 1: tarifaBasica = 10000;
                break;
                 case 2: tarifaBasica = 15000;
                break;
                 case 3: tarifaBasica = 30000;
                break;
                 case 4: tarifaBasica = 50000;
                break;
                 case 5: tarifaBasica = 65000;
                break;
            }
            
            }
            System.out.println("la tarifa Basica es "+ tarifaBasica);
           tarifaTotal = tarifaTotal + tarifaBasica;
        }
        System.out.println("Total tarifas basicas USUARIOS: "+ tarifaTotal);
    }
    
}
