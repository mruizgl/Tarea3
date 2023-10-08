package ejercicio10;
import java.util.Scanner;
/**
 *
 * @author Melissa
 */  
//EJERCICIO 10 Calcular la suma de todos los números pares entre 1 y un número ingresado por el usuario utilizando un bucle do-while.
public class ejercicio10 {
    public static void main(String[] args){
    Scanner n = new Scanner (System.in);
    
    System.out.print("Ingrese un número: "); //Solicitar al usuario que ingrese un número..
    int numero = n.nextInt();

    int suma = 0;
    int i = 2; //Iniciamos con el primer numero par, que es 2

    do {      //aqui comineza el bucle do-while
        suma +=i; //sumamos el valor de i a la variable suma, luego incrementamos i en 2 para avanzar al siguiente numero par
        i +=2; 


    } while (i <= numero); //VERIFICAMOS si i es menor o igual al número ingresado por el usuario. Si esta condición es verdadera el bucle se repite y continua.. sumando numeros pares. Si es falsa, el bucle se detiene

    System.out.println("La suma de los números pares entre 1 y " + numero + " es: " + suma); //Este es el resultado final en el que mostramos la suma de numeros pares!



    }
}
