public class CA_MetodosYVariables {

    public static void main(String[] args) {
        
        /*
         ================================ =====
         * = Variables y Tipos Primitivos =
         ================================ =====
         */

        // Declara una variable String que contiene tu nombre y muéstralo por pantalla.
        // Ejemplo:
        String nombre = "Tu Nombre";
        System.out.println("Mi nombre es: " + nombre);

        // Declara dos variables int, asignales valores y muestra la suma de ambas.
        int a = 5;
        int b = 3;
        int suma = a + b;
        System.out.println("La suma de " + a + " y " + b + " es: " + suma);

        // Declara dos variables int y muestra la resta del primero menos el segundo.
        int resta = a - b;
        System.out.println("La resta de " + a + " menos " + b + " es: " + resta);

        // Declara dos variables int y muestra su multiplicación.
        int multiplicacion = a * b;
        System.out.println("La multiplicación de " + a + " y " + b + " es: " + multiplicacion);

        // Declara dos variables int y muestra la división entera entre ellas.
        int division = a / b;
        System.out.println("La división de " + a + " entre " + b + " es: " + division);

        // Declara dos variables int y muestra el resultado del módulo operador %.
        int modulo = a % b;
        System.out.println("El módulo de " + a + " dividido por " + b + " es: " + modulo);

        // Declara una variable String para el nombre y una variable int para la edad.
        // Muestra un mensaje concatenando ambas.
        int edad = 25;
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");

        // Declara al menos una variable de cada tipo primitivo y muestra un mensaje que confirma que todo está bien declarado.
        byte byteVar = 10;
        short shortVar = 100;
        int intVar = 1000;
        long longVar = 100000L;
        float floatVar = 5.5f;
        double doubleVar = 10.99;
        char charVar = 'A';
        boolean booleanVar = true;

        System.out.println("Tipos primitivos declarados correctamente: ");
        System.out.println("Byte: " + byteVar + ", Short: " + shortVar + ", Int: " + intVar + ", Long: " + longVar);
        System.out.println("Float: " + floatVar + ", Double: " + doubleVar + ", Char: " + charVar + ", Boolean: " + booleanVar);

        /*
         =============================== =====
         * = Operaciones con variables =
         =============================== =====
         */

        // Declara un método saludar() que imprima un saludo y llámalo desde otro método.
        saludar();

        // Declara un método que recibe un número como argumento y lo imprima por pantalla.
        imprimirNumero(10);

        // Declara un método que recibe dos int, sume ambos y devuelva el resultado.
        int resultadoSuma = suma(5, 3);
        System.out.println("La suma de 5 y 3 es: " + resultadoSuma);

        // Sobrecarga el método saludar para que también acepte un nombre y lo imprima.
        saludar("Juan");

        // Sobrecarga el método suma para que pueda recibir tres números.
        int resultadoSuma3 = suma(2, 3, 4);
        System.out.println("La suma de 2, 3 y 4 es: " + resultadoSuma3);

        // Declara dos variables int, pásalas a un método que sume y devuelva el resultado, y muéstralo.
        int num1 = 7;
        int num2 = 8;
        int sumaResultado = suma(num1, num2);
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + sumaResultado);

        // Haz una multiplicación entre dos variables double y muestra el resultado.
        double x = 5.5;
        double y = 4.2;
        double multiplicacionDouble = multiplicar(x, y);
        System.out.println("La multiplicación entre " + x + " y " + y + " es: " + multiplicacionDouble);

        /*
         =============================== =====
         * = Conversiones y Constantes =
         =============================== =====
         */

        // Declara una variable int ygnala a una variable double.
        int intVar2 = 7;
        double doubleVar2 = intVar2;  // Conversión implícita
        System.out.println("Valor de int convertido a double: " + doubleVar2);

        // Declara una variable double y haz una conversión explícita (casting) a int.
        double doubleVar3 = 9.87;
        int intVar3 = (int) doubleVar3;  // Conversión explícita
        System.out.println("Valor de double convertido a int: " + intVar3);

        // Calcula el área de un triángulo utilizando base y altura como doble.
        double base = 5.0;
        double altura = 10.0;
        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);

        // Declara una variable String para ciudad y una int para el año.
        // Imprime una frase como "Aprendiendo Java en Ciudad en el año 2025."
        String ciudad = "Madrid";
        int año = 2025;
        System.out.println("Aprendiendo Java en " + ciudad + " en el año " + año + ".");

        // Declara un método que reciba un número y devuelva su cuadrado.
        int cuadradoResultado = cuadrado(4);
        System.out.println("El cuadrado de 4 es: " + cuadradoResultado);

        /*
         =============================== =====
         * = Operaciones Compuestas y Métodos =
         =============================== =====
         */

        // Declara dos variables y muestra cuál es mayor utilizando el operador ternario (?).
        int num3 = 15;
        int num4 = 10;
        String mayor = (num3 > num4) ? "num3 es mayor" : "num4 es mayor";
        System.out.println(mayor);

        // Declarar tres variables String y concaténalas en una frase completa.
        String saludo = "Hola, ";
        String nombreCompleto = "Juan";
        String fraseCompleta = saludo + nombreCompleto + "!";
        System.out.println(fraseCompleta);

        // Declara dos variables int, multiplícalas y almacena el resultado en una variable. Imprime el resultado.
        int multiplicacion2 = num3 * num4;
        System.out.println("El resultado de la multiplicación es: " + multiplicacion2);

        // Crea un método que reciba dos enteros y devuelva su promedio como double. Imprime el resultado.
        double promedioResultado = promedio(num3, num4);
        System.out.println("El promedio de " + num3 + " y " + num4 + " es: " + promedioResultado);

    }

    // Métodos

    // Método que imprime un saludo
    public static void saludar() {
        System.out.println("¡Hola, bienvenido a Java!");
    }

    // Método que imprime un número
    public static void imprimirNumero(int num) {
        System.out.println("El número es: " + num);
    }

    // Método que suma dos números
    public static int suma(int a, int b) {
        return a + b;
    }

    // Sobrecarga de método suma para tres números
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

    // Sobrecarga de método saludar con nombre
    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }

    // Método que multiplica dos números double
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método que calcula el cuadrado de un número
    public static int cuadrado(int num) {
        return num * num;
    }

    // Método que calcula el promedio de dos enteros
    public static double promedio(int a, int b) {
        return (a + b) / 2.0;
    }
}































