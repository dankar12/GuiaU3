import java.util.Scanner;
public class guia16 {
	
	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el radio del círculo
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular el área del círculo (fórmula: área = π * radio^2)
        double area = Math.PI * Math.pow(radio, 2);

        // Imprimir el resultado
        System.out.println("\n Área del Círculo: ");
        System.out.println("Radio: " + radio);
        System.out.println("Área: " + area);

        
        scanner.close();
    }
}
	
