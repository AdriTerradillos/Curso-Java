import java.util.Arrays;

public class E_Array {
    public static void main(String[] args) {
    
        // Ejercicio 1. Crear un array de 5 enteros e imprimirlos uno a uno.
            System.out.println("EJERCICIO 1: ");
        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
    
            System.out.println(Arrays.toString(numeros));
    
        // Ejercicio 2. Crear un array de 3 Strings con nombres e imprimirlos.
                System.out.println("EJERCICIO 2: ");
        String[] nombres = {"Santiago", "Elena", "Javier"};
                System.out.println(Arrays.toString(nombres));
    
        // Ejercicio 3. Crear un array de 4 booleanos con valores alternos y mostrarlos.
            System.out.println("EJERCICIO 3: ");
        boolean[] valores = {true, false, true, false};
            System.out.println(Arrays.toString(valores));
    
        // Ejercicio 4. Crear un array de caracteres que contienen las voces.
            System.out.println("EJERCICIO 4: ");
        char[] voces = {'A', 'D', 'G', 'M'};
            System.out.println(Arrays.toString(voces));
    
        // Ejercicio 5. Crear un array de 10 enteros sin inicializar, asignar los valores del 1 al 10 y mostrarlos.
                System.out.println("EJERCICIO 5: ");
        int[] Numeros = new int[10];
        for (int i = 0; i < Numeros.length; i++) {
                Numeros[i] = i + 1;
            }
                System.out.println(Arrays.toString(Numeros));
    
        // Ejercicio 6. Crear un array de 6 números double e imprimir el doble de cada valor.
                    System.out.println("EJERCICIO 6: ");
            double[] decimales = {6.7, 10.5, 20.5, 30.4, 40.6, 50.2};
            for (int i = 0; i < decimales.length; i++) {
                double doble = decimales[i] * 2;
                    System.out.println("El doble de " + decimales[i] + " es: " + doble);
            }
    
        // Ejercicio 6.1 Al array de 6 números que acabas de crear ahora vas a cambiar el valor de cada uno de sus elementos.
                    System.out.println("EJERCICIO 6.1: ");
            float[] Decimales = {6.7f, 10.5f, 20.5f, 30.4f, 40.6f, 50.2f};
            for (int i = 0; i < Decimales.length; i++) {
                Decimales[i] = Decimales[i] * 2;
                    System.out.println("El doble de " + Decimales[i] / 2 + " es: " + Decimales[i]);
            }
    
        // Ejercicio 7. Crear un array con los días de la semana e imprimir solo los días laborables.
                    System.out.println("EJERCICIO 7: ");
            String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
                    System.out.println("Días laborables: ");
            for (int i = 0; i < 5; i++) {
                    System.out.println(diasSemana[i]);
            }
    
        // Ejercicio 8. Crear un array de 5 elementos de tipo byte e inicializarlos con valores del 10 al 50.
                System.out.println("EJERCICIO 8: ");
            byte[] numByte = {10, 20, 30, 40, 50};
                System.out.println(Arrays.toString(numByte));
    
        // Ejercicio 9. Crear un array de 4 float y mostrar solo los mayores a 2.5.
                    System.out.println("EJERCICIO 9: ");
            float[] numerofloat = {1.25f, 7.3f, 0.475f, 5.98f};
                    System.out.println("Los números mayores a 2.5 son: ");
            for (float num : numerofloat) {
                if (num > 2.5) {
                    System.out.println(num);
                }
            }
    
        // Ejercicio 10. Crear un array de enteros con valores negativos y contarlos desde cero.
                System.out.println("EJERCICIO 10: ");
            int[] Numerosint = {-10, -20, -30, -40, -50, -60, -70, -80, -90, -100};
            int contadoresNegativos = 0;
    
            for (int num : Numerosint) {
                if (num <= 0) {
                    contadoresNegativos++;
                }
            }
                System.out.println("Cantidad de números negativos: " + contadoresNegativos);
        }
    }

