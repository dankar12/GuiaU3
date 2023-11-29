import java.util.Scanner;
public class guia14 {
	
	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su nombre completo
        System.out.print("Ingrese su nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        // Pedir al usuario que ingrese su edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de nextInt()

        // Pedir al usuario que ingrese su correo electrónico
        System.out.print("Ingrese su correo electrónico: ");
        String correoElectronico = scanner.nextLine();

        // Pedir al usuario que ingrese su número de teléfono
        System.out.print("Ingrese su número de teléfono: ");
        String telefono = scanner.nextLine();

        // Cerrar el objeto Scanner después de usarlo
        scanner.close();

        // Imprimir la ficha de contacto
        System.out.println("\nFICHA DE CONTACTO:");
        System.out.println("Nombre Completo: " + nombreCompleto);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Correo Electrónico: " + correoElectronico);
        System.out.println("Teléfono: " + telefono);
    }
}
	
