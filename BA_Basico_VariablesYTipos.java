public class BA_Basico_VariablesYTipos {
    public static void main(String[] args) {
        
        // 1. Declarar variables de tipos numéricos y conversiones implícitas
        byte byteVar = 10;           // Tipo byte
        short shortVar = 1000;       // Tipo short
        int intVar = 48765;          // Tipo int
        long longVar = 4500686L;      // Tipo long
        float floatVar = 3.14f;      // Tipo float
        double doubleVar = 3.14159;  // Tipo double

        // Conversiones implícitas
        intVar = byteVar; // byte a int (automático)
        longVar = intVar; // int a long (automático)
        doubleVar = floatVar; // float a double (automático)

        System.out.println("Estas son algunas de las conversiones implícitas entre tipos:");
        System.out.println("EJERCICIO 1:");
        System.out.println("byte a int: " + intVar);
        System.out.println("int a long: " + longVar);
        System.out.println("float a double: " + doubleVar);

        // 2. Declarar un char y almacenarlo en un int
        char letra = 'A';
        int valorInt = letra;

        System.out.println("\nEJERCICIO 2:");
        System.out.println("El valor de la variable char 'A' en formato int es: " + valorInt);

        // 3. Intentar convertir un long a un short sin casting (ERROR)
        long largo = 2354L;
        // short corto = largo; // ERROR: incompatible types
        short corto = (short) largo; // Se necesita un casteo

        System.out.println("\nEJERCICIO 3:");
        System.out.println("Valor long: " + largo);
        System.out.println("Valor short (con casting): " + corto);

        // 4. Asignar float a double y viceversa
        float numFloat = 3.14f;
        double numDouble = numFloat; // float a double (automático)
        float otroFloat = (float) numDouble; // double a float (requiere casting)

        System.out.println("\nEJERCICIO 4:");
        System.out.println("Valor float: " + numFloat);
        System.out.println("Valor double después de asignar float: " + numDouble);
        System.out.println("Valor float después de asignar double (con casting): " + otroFloat);

        // 5. Casteo de double a int
        double decimal = 5.99;
        int entero = (int) decimal; // Pierde la parte decimal

        System.out.println("\nEJERCICIO 5:");
        System.out.println("Valor double: " + decimal);
        System.out.println("Valor int después del casteo: " + entero);
    }
}
 
 
 /* Cada ejercicio tiene su espacio, recuerda:
 * System.out.println(); para mostrar por pantalla fotos que marcar en qué ejercicio estás
 * y el proceso que vas haciendo.
 * */
/* */
 
