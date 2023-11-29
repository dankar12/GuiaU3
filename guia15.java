import java.util.Scanner;
public class guia15 {
	
	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el número de la tabla de multiplicar
        System.out.print("Ingrese el número de la tabla de multiplicar que desea ver: ");
        int numeroTabla = scanner.nextInt();

        // Imprimir la tabla de multiplicar
        System.out.println("\n--- Tabla de Multiplicar del " + numeroTabla + " ---");
        for (int i = 1; i <= 10; i++) {
            int resultado = numeroTabla * i;
            System.out.println(numeroTabla + " x " + i + " = " + resultado);
        }

        
        scanner.close();
    }
}
	
