public class BB_IntermedioVariablesYTipos {
    public static void main(String[] args) {
        
        // 1. Declarar una variable int y una double.
        int intVar = 10;
        double numDouble = 8.5;
        double resultado = intVar + numDouble; // La operación entre int y double da como resultado un double

            System.out.println("EJERCICIO 1:");
            System.out.println("El resultado de la operación es: " + resultado);

        // 2. Declarar una variable int y una String, concatenarlas y luego convertir a int
        int numero = 15;
        String texto = "20"; // Ahora el texto contiene solo números para convertirlo luego en int



        // Concatenación (el resultado es una cadena)
        String concatenado = numero + texto;
            System.out.println("\nEJERCICIO 2:");
            System.out.println("Concatenación: " + concatenado);

        // Intentar convertir la concatenación a int (esto funciona solo si la cadena resultante es numérica)
        int resultado2 = Integer.parseInt(texto); // Solo tomamos la parte numérica
        System.out.println("Número convertido a int: " + resultado2);



        // 3. Operación matemática entre un char y un int
        char letra = 'A'; 
        int numero2 = 8;
        int resultado3 = letra + numero2; 

            System.out.println("\nEJERCICIO 3:");
            System.out.println("Resultado de la operación entre char e int: " + resultado3);



        // 4. Desbordamiento en una variable byte
        byte byteVar = 127; // Valor máximo de byte
        byte resultadoByte = (byte) (byteVar + 1); // Se pasa de rango máximo de byte 

            System.out.println("\nEJERCICIO 4:");
            System.out.println("El valor original de byte es: " + byteVar);
            System.out.println("Valor después de sumar 1 (desbordamiento): " + resultadoByte);
            System.out.println("Explicación: Como byte tiene un rango de -128 a 127, al sumar 1 a 127 el valor vuelve a -128.");



        // 5. Conversión de un long mayor que int a int
        long numLargo = 3736345237L; // variable de long
        int intConvertido = (int) numLargo; // 

            System.out.println("\nEJERCICIO 5:");
            System.out.println("Valor de long: " + numLargo);
            System.out.println("Valor de int después de convertir: " + intConvertido);
            System.out.println("Explicación: Como el valor de long supera el rango de int, se produce una pérdida de datos.");
    }
}
