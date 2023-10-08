package ejercicio8;
import java.util.Scanner;
/**
 *
 * @author Melissa
 */  
//EJERCICIO 8 Encontrar y mostrar todos los números perfectos en un rango dado utilizando un bucle for. Solicita el límite por teclado.

public class ejercicio8 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el límite del rango: "); // Solicitar al usuario que ingrese el límite del rango
        int limite = scanner.nextInt();

        System.out.println("Números perfectos en el rango de 1 a " + limite + ":");

        // Iterar a través de los números en el rango
        for (int numero = 1; numero <= limite; numero++) {
            if (esNumeroPerfecto(numero)) {
                System.out.println(numero);
            }
        }
       
    }

    // Función para verificar si un número es perfecto
    public static boolean esNumeroPerfecto(int numero) {
        int sumaDivisores = 0;

        // Iterar a través de los posibles divisores del número
        for (int divisor = 1; divisor < numero; divisor++) {
            if (numero % divisor == 0) {
                sumaDivisores += divisor;
            }
        }

        // Verificar si la suma de los divisores es igual al número
        return sumaDivisores == numero;
    }
}
