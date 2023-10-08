package ejercicio7;
import java.util.Scanner;
/**
 *
 * @author Melissa
 */  
//EJERCICIO 7. Imprimir el nombre del día de la semana correspondiente a un número ingresado por el usuario utilizando una estructura switch.

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.print("Ingrese un número del 1 al 7: "); //// Solicitar al usuario que ingrese un número del 1 al 7
        int numero = scanner.nextInt();

        // Utilizar una estructura switch para imprimir el día correspondiente
        String diaSemana;
        switch (numero) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miércoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "Número inválido";
        }

        System.out.println("El día de la semana es: " + diaSemana);

        scanner.close();
    }
}
