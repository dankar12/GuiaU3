
public class guia24 {
	
	public static void main(String[] args) {
		System.out.println("Números primos entre 2 y 500:");

        for (int numero = 2; numero <= 500; numero++) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
            }
        }
    }

    private static int contarDivisores(int numero) {
        int count = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                count++;
            }
        }

        return count;
    }

    private static boolean esPrimo(int numero) {
        return contarDivisores(numero) == 2;
    }
}
	
