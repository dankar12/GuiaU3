import java.util.Scanner;
public class guia22 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = scanner.nextInt();

        // Calcular el factorial del número
        long factorial = calcularFactorial(numero);

        // Imprimir el resultado
        System.out.println("El factorial de " + numero + " es: " + factorial);

        scanner.close();
    }

    private static long calcularFactorial(int n) {
        // Verificar si el número es no negativo
        if (n < 0) {
            System.out.println("El factorial no está definido para números negativos.");
            return -1; // Valor de retorno indicando un error
        }

        // Caso base: factorial de 0 es 1
        if (n == 0 || n == 1) {
            return 1;
        }

        
        long resultado = 1;

        
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }
}
	
