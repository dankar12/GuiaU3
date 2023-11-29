import java.util.Scanner;
public class guia23 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();

        // Verificar si el número es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número que ingreso es positivo.");
        } else if (numero < 0) {
            System.out.println("El número que ingreso es negativo.");
        } else {
            System.out.println("El número que ingreso es cero.");
        }

        scanner.close();
    }
}
	
