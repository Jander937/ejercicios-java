/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;
import java.util.Scanner;
/**
 *
Elabore un algoritmo que lea el nombre, el salario bruto de dos empleados
* y luego calcule las deducciones (8% del salario bruto) y las bonificaciones 
* (10% del salario bruto) de los dos trabajadores, por último, imprima el nombre del que más salario neto tiene.
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String nombre1,nombre2;
        int salario_bruto1,salario_bruto2;
        double deduciones1,deduciones2;
        double bonificaciones1,bonificaciones2;
        double salario_neto1,salario_neto2;
        System.out.println("Digite nombre del primer trabajador ");
        nombre1 = teclado.next();
        System.out.println("Digite nombre del segundo trabajador ");
        nombre2 = teclado.next();
        System.out.println("Digite su Salario Bruto del primer trabajador ");
        salario_bruto1 = teclado.nextInt();
        System.out.println("Digite su Salario Bruto del segunda trabajador ");
        salario_bruto2 = teclado.nextInt();
        deduciones1 = salario_bruto1 * 0.08;
        deduciones2 = salario_bruto2 * 0.08;
        bonificaciones1 = salario_bruto1 * 0.1;
        bonificaciones2 = salario_bruto2 * 0.1;
        salario_neto1 = salario_bruto1 + bonificaciones1 - deduciones1;
        salario_neto2 = salario_bruto2 + bonificaciones2 - deduciones2;
        System.out.println("salario neto del primer trabajador " + salario_neto1);
        System.out.println("salario neto del segundo trabajador " + salario_neto2);
    }
    
}
