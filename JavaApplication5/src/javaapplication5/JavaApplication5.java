/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;
import java.util.Scanner;
/**
 *
 * @author ADRIAN
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre_Articulo;
        double precio_Unidad;
        int cantidad_Articulos;
        double total = 0;
        for (int i = 1; i <=20; i++){
            System.out.println("ingrese el nombre del articulo ");
            nombre_Articulo = teclado.next();
            System.out.println("ingrese el valor unitario ");
            precio_Unidad = teclado.nextDouble();
            System.out.println("ingrese la cantidad de articulos ");
            cantidad_Articulos = teclado.nextInt();
            total = cantidad_Articulos * precio_Unidad;
            System.out.println("el total es " + total);
        }
        
    }
    
}

    
    
