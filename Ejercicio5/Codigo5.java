package Ejercicio5;
/*Funcionamiento:recibe un numero a traves del Scanner que despues guarda en ni,
que es un string despues lo convertimos a un entero y se guarda en c, se crean otras dos variables enteras.Con la condicion While, 
extrae el ultimo digito y lo guarda en digito para despues comparalo con 3,7,8 y 9.Si es igual incrementoa la variable afo y de lo contrario la noAfo.
Despues evalua afo y noAFO y dependiendo la evaluacion imprime en pantalla el resultado.*/

import java.util.Scanner; // Importamos la paquetería

public class Codigo5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Agregamos System.in en Scanner()

        System.out.print("Introduzca un número: ");  
        String ni = s.nextLine(); 
        int c = Integer.parseInt(ni); // Convertimos el String a int
        int original = c; // Guardamos el valor original de c
        int afo = 0;
        int noAfo = 0;

        while (c > 0) { // Mientras haya dígitos en c
            int digito = c % 10; // Extraemos el último dígito

            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++;
            } else {
                noAfo++;
            }
            
            c /= 10; // Eliminamos el último dígito
        } // Aquí cerramos correctamente el `while`

        // Evaluamos si es afortunado o no
        if (afo > noAfo) {
            System.out.println("El número " + original + " es afortunado.");
        } else {
            System.out.println("El número " + original + " no es afortunado.");
        }

        s.close(); // Cerramos el Scanner
    }
}