package tarea3.ejercicio1;

public class ejercicio_1 {
/**
 *
 * @author Melissa
 */


//EJERCICIO: Escribe un programa en Java que imprima el patrón siguiente:
1 

2 3 

4 5 6 

7 8 9 10     
    public static void main(String[] args) {


//declaramos variable que comienza con el numero entero 1
    int numero = 1; 
    for (int i = 0; i <=4;  i++) {
        for (int j = 0; j <i; j++){
          System.out.print(numero + " "); 
          numero++; 
        }
        System.out.println ();

}
        
    }
}    