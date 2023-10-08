package ejercicio4;
import java.util.Scanner;
public class ejercicio4 {    
/**
 *
 * @author Melissa
 */ 

 //EJERCICIO 4: Escribe un programa en Java que verifique si un número es palíndromo. Se debe solicitar el número por teclado.
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);  // Crear un objeto Scanner para leer la entrada del usuario       
        System.out.print("Ingrese un número: ");   // Solicitar al usuario que ingrese un número
        int numero = scanner.nextInt();

        // Verificar si el número es un palíndromo
        if (esPalindromo(numero)) {
            System.out.println(numero + " es un palíndromo.");
        } else {
            System.out.println(numero + " no es un palíndromo.");
        }

        
        scanner.close(); // Cerrar el objeto Scanner
    }

    // Función para verificar si un número es un palíndromo
    public static boolean esPalindromo(int numero) {
        int numeroOriginal = numero;
        int numeroInvertido = 0;

        // Invertir el número
        while (numero > 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }

        
        return numeroOriginal == numeroInvertido;  // Verificar si el número original es igual al número invertido
    }
}    

