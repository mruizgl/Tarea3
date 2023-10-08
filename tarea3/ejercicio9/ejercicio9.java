package ejercicio9;
import java.util.Scanner;
/**
 *
 * @author Melissa
 */  
//EJERCICIO 9 Imprimir la tabla de multiplicar de un número ingresado por el usuario utilizando un bucle for. Solicita el valor de la tabla por teclado.
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese un número para la tabla de multiplicar: "); // Solicitar al usuario que ingrese un número para la tabla de multiplicar
        int numero = scanner.nextInt();

       
        System.out.println("Tabla de multiplicar del " + numero + ":");  // Mostrar encabezado de la tabla para que quede más estético

        // Utilizar un bucle for para generar la tabla de multiplicar
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            // Imprimir cada línea de la tabla con formato
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}

