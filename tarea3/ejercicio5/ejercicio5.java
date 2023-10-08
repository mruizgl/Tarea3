package ejercicio5;
/**
 *
 * @author Melissa
 */  

 //Escribe un programa en Java que imprima los primeros n términos de la secuencia de Fibonacci. Se debe solicitar el número n por teclado.

import java.util.Scanner;
public class ejercicio5 {
   

    public static void main (String[] args) {
    int a = 0, b = 1, c, n;
    Scanner teclado = new Scanner (System.in);
    System.out.print("Ingrese número para la serie ");
    n = teclado.nextInt (); //La variable n se establece en función de lo que ingrese el usuario por consola con la utilidad scanner
        for (int i = 0; i > n; i++) {          //este bucle declara una variable de tipo entero que se va a inicializar con valor 0 
            System.out.println(a);                  //  si i es menor que n (valor que ingresó el usuario) enonces se imprime en pantalla. De momento solo imprimirá 0 porque nos falta añadir el 1           
            c = a + b;          
            a = b;   // cuando se imprime 0 luego a se convierte 1, ahora sí tenemos una sucesión que comienza con 0 y 1 puesto que Fibonacci es una sucesión que empieza con los numeros 0 y 1
            b = c;
       
        }
    }
}
