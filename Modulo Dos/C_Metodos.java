import java.util.Scanner;

public class C_Metodos {
    // Variable Scanner global para ser usada en todos los métodos
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Pedir dos números enteros mayores que 0 al usuario
        System.out.println("Introduce el primer número (entero y mayor que 0):");
        int a = sc.nextInt();

        System.out.println("Introduce el segundo número (entero y mayor que 0):");
        int b = sc.nextInt();

        // Llamar a los métodos y almacenar los resultados
        int suma = sumar(a, b);
        int resta = restar(a, b);
        int multiplicacion = multiplicar(a, b);
        double division = dividir(a, b);
        int modulo = modulo(a, b);

        // Mostrar los resultados por pantalla
        System.out.println("\nResultados de la calculadora:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + (b != 0 ? division : "No se puede dividir entre 0"));
        System.out.println("Módulo: " + (b != 0 ? modulo : "No se puede calcular módulo con 0"));

        // Cerrar Scanner
        sc.close();
    }

    // Métodos privados estáticos para las operaciones matemáticas
    private static int sumar(int x, int y) {
        return x + y;
    }

    private static int restar(int x, int y) {
        return x - y;
    }

    private static int multiplicar(int x, int y) {
        return x * y;
    }

    private static double dividir(int x, int y) {
        if (y != 0) {
            return (double) x / y;
        } else {
            System.out.println("Error: No se puede dividir entre 0.");
            return Double.NaN; // Valor especial que indica que no hay resultado válido
        }
    }

    private static int modulo(int x, int y) {
        if (y != 0) {
            return x % y;
        } else {
            System.out.println("Error: No se puede calcular módulo con 0.");
            return -1; // Retorno arbitrario para indicar error
        }
    }
}