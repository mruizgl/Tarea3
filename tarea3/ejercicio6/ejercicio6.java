package ejercicio6;
/**
 *
 * @author Melissa
 */  
//EJERCICIO 6. Escribe un programa en Java que encuentre todos los números Armstrong entre 1 y 1000.

    public class ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Números de Armstrong entre 1 y 1000:");

        for (int numero = 1; numero <= 1000; numero++) {
            if (esNumeroArmstrong(numero)) {
                System.out.print(numero + " ");
            }
        }
    }

    // Función para verificar si un número es de Armstrong
    public static boolean esNumeroArmstrong(int numero) {
        int numeroOriginal = numero;
        int suma = 0;
        int n = contarDigitos(numero);

        while (numero > 0) {
            int digito = numero % 10;
            suma += Math.pow(digito, n);
            numero /= 10;
        }

        return suma == numeroOriginal;
    }

    // Función para contar el número de dígitos en un número
    public static int contarDigitos(int numero) {
        int contador = 0;

        while (numero != 0) {
            numero /= 10;
            contador++;
        }

        return contador;
    }
}

