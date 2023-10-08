package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

/**
 *
 * @author Melissa
 */ 

    //EJERCICIO 3: Escribe un programa en Java que encuentre el número de Fibonacci en la posición n.  Se debe solicitar el número por teclado.   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la posición n para encontrar el número de Fibonacci: ");
        int n = scanner.nextInt();   //se establecerá n en función de lo que escriba el usuario gracias a la utilidad scanner
        
        if (n < 0) {
            System.out.println("Por favor, ingrese un número positivo."); //Con esto no se mostrará un número que sea negativo
        } else {
            int resultado = calcularFibonacci(n);
            System.out.println("El número de Fibonacci en la posición " + n + " es: " + resultado); //Imprimir resultado
        }
        
        
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {    //Si n es igual a 0 o 1, retornamos a "n" directamente porque los números de Fibonacci en esas posiciones son 0 y 1 respectivamente
            return n;
        } else {        //Por el contrario, si "n" es maor que 1, inicializamos tres variables, fib1 en 0 y fib1 en 1, fibActual para almacenar el número de Fibonacci en la posición actual
            int fib1 = 0;
            int fib2 = 1;
            int fibActual = 0;

            for (int i = 2; i <= n; i++) { //Luego, utilizamos un bucle for para iterar desde la posición 2 hasta la posición n. En cada iteración, calculamos fibActual como la suma de fib1 y fib2, y luego actualizamos fib1 y fib2 para que contengan los valores de las dos posiciones anteriores.
                fibActual = fib1 + fib2;
                fib1 = fib2;
                fib2 = fibActual;
            }

            return fibActual; //Finalmente, retornamos fibActual, que contiene el número de Fibonacci en la posición n.
        }
    }
} //Cierra clase
