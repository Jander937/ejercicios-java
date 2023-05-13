/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto3;
import java.util.Scanner;
/**
 *
 * @author ADRIAN
 */
public class Proyecto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
       
        long documento, tarifaBasica = 0, totalTarifas= 0;
char estado;
int estrato, N;
//proceso
System.out.println("Cantidad de usuarios: ");
N = consola.nextInt();
for (int i = 0; i<N; i++) {

System.out.println("Documento de identidad: ");
documento = consola.nextLong();
System.out.println("Estado (A: Activo | S: suspendido): ");
estado = consola.next().charAt(0);  // leer variables tipo char
System.out.println("Estrato -> (1, 2 ,3 , 4 ,5 ): ");
estrato = consola.nextInt();

if (estado == 'S' || estado == 's') {
tarifaBasica = 0;

}

else {

switch (estrato) {
case 1: tarifaBasica = 10000;break;
case 2: tarifaBasica = 15000;break;
case 3: tarifaBasica = 30000;break;
case 4: tarifaBasica = 50000;break;
case 5: tarifaBasica = 65000;break;
}
}

System.out.println("Tarifa basica: " + tarifaBasica);
totalTarifas = totalTarifas + tarifaBasica;


}

System.out.println("Total tarifas basicas USUARIOS: "+ totalTarifas);
    }
    
}
