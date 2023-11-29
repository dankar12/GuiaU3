import java.util.Scanner;
public class guia21 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Seleccione una opción (1-4 para ordenar, 0 para salir): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ha ordenado tacos de cecina.");
                    break;
                case 2:
                    System.out.println("Ha ordenado tacos de pastor.");
                    break;
                case 3:
                    System.out.println("Ha ordenado tacos de bistec.");
                    break;
                case 4:
                    System.out.println("Ha ordenado tacos de carne.");
                    break;
                case 0:
                    System.out.println("Gracias por visitar nuestra taquería... ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }

            // Consumir el salto de línea pendiente
            scanner.nextLine();

        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú de Taquería ---");
        System.out.println("1. Tacos de cecina");
        System.out.println("2. Tacos de pastor");
        System.out.println("3. Tacos de bistec");
        System.out.println("4. Tacos de carne");
        System.out.println("0. Salir");
    }
}
	
