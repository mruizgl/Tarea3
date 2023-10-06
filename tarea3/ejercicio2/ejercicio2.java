package tarea3.ejercicio2;
/**
 *
 * @author Melissa
 */ 

 //EJERCICIO: Escribe un programa en Java que encuentre el máximo común divisor (MCD) de dos números. Se debe solicitar los números por teclado.

 
import java.util.Scanner; // Importamos la clase Scanner del API de Java, lo usaremos para pedir al usuario los números que más adelante solicitaremos para determinar el MCD de ambos números
public class ejercicio2 { //Escribe un programa en Java que encuentre el máximo común divisor (MCD) de dos números. Se debe solicitar los números por teclado.

    public static void main (String[] args) { 

    int num1, num2;
    Scanner n=new Scanner (System.in); //Establecemos que n es lo que introduzca el usuario
    System.out.println("Ingrese el primero número: ");
    num1=n.nextInt(); // num1 será lo que haya introducido el usuario por consola para el primer número
    System.out.println("Ingrese el segundo número: ");
    num2=n.nextInt();  //num2 será lo que haya introducido el usuario por consola para el segundo número
    while (num1!=num2) //mientras num1 sea diferente a num2
        if(num1>num2) //si num1 es mayor que num2...
            num1=num1-num2; //..num1 será igual a la resta entre num1-num2
    else
            num2=num2-num1; //de lo contrario, num2 será igual a la resta entre num 2 y num1

    System.out.print("El MCD es: " +num1); //Imprime en pantalla el resultado!





    } //cierre main 
} //cierre de la clase
