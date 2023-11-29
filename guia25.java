import java.util.Scanner;
public class guia25 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número del 1 al 7
        System.out.print("Ingrese un número para saber el día de la semana: ");
        int numeroDia = scanner.nextInt();

        // Imprimir el saludo según el número ingresado
        switch (numeroDia) {
            case 1:
                System.out.println("Hola, soy el día Domingo.");
                break;
            case 2:
                System.out.println("Hola, soy el día Lunes.");
                break;
            case 3:
                System.out.println("Hola, soy el día Martes.");
                break;
            case 4:
                System.out.println("Hola, soy el día Miércoles.");
                break;
            case 5:
                System.out.println("Hola, soy el día Jueves.");
                break;
            case 6:
                System.out.println("Hola, soy el día Viernes.");
                break;
            case 7:
                System.out.println("Hola, soy el día Sábado.");
                break;
            default:
                System.out.println("Número no válido. Por favor, ingrese un número del 1 al 7.");
        }

        scanner.close();
    }
}
	
