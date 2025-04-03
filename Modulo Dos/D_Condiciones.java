public class D_Condiciones {

    public static void main(String[] args) {
        // Segundo paso: Llamando a todos los ejercicios
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
        ejercicio11();
        ejercicio12();
        ejercicio13();
        ejercicio14();
        ejercicio15();
        ejercicio16();
        ejercicio17();
        ejercicio18();
        ejercicio19();
        ejercicio20();
        ejercicio21();
        ejercicio22();
        ejercicio23();
        ejercicio24();
        ejercicio25();
    }


    // Primer paso: Ejercicios
    // 1. Verificar si un número es positivo
    public static void ejercicio1() {
        int numero1 = 5;
        if (numero1 > 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número no es positivo.");
        }
    }

    // 2. Verificar si un número es negativo
    public static void ejercicio2() {
        int numero2 = -5;
        if (numero2 < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número no es negativo.");
        }
    }

    // 3. Verificar si un número es cero
    public static void ejercicio3() {
        int numero3 = 0;
        if (numero3 == 0) {
            System.out.println("El número es cero.");
        } else {
            System.out.println("El número no es cero.");
        }
    }

    // 4. Comprobar si un número es par
    public static void ejercicio4() {
        int numero4 = 8;
        if (numero4 % 2 != 0) {
            System.out.println("El número es impar.");
        } else {
            System.out.println("El número es par.");
        }
    }

    // 5. Comprobar si un número es impar
    public static void ejercicio5() {
        int numero5 = 9;
        if (numero5 % 2 != 0) {
            System.out.println("El número es impar.");
        } else {
            System.out.println("El número es par.");
        }
    }

    // 6. Verificar si una persona es mayor de edad
    public static void ejercicio6() {
        int edad = 20;
        if (edad >= 18) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona es menor de edad.");
        }
    }

    // 7. Comparar dos números
    public static void ejercicio7() {
        int numero6 = 10;
        int numero7 = 15;
        if (numero6 > numero7) {
            System.out.println("El primer número es mayor.");
        } else if (numero6 < numero7) {
            System.out.println("El segundo número es mayor.");
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }

    // 8. Validar si un número está en un rango
    public static void ejercicio8() {
        int numero8 = 50;
        if (numero8 >= 10 && numero8 <= 100) {
            System.out.println("El número está dentro del rango.");
        } else {
            System.out.println("El número no está dentro del rango.");
        }
    }

    // 9. Verificar si un carácter es una vocal
    public static void ejercicio9() {
        char caracter = 'a';
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ||
            caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
            System.out.println("Es una vocal.");
        } else {
            System.out.println("No es una vocal.");
        }
    }

    // 10. Verificar si un año es bisiesto
    public static void ejercicio10() {
        int anio = 2024;
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año es bisiesto.");
        } else {
            System.out.println("El año no es bisiesto.");
        }
    }

    // 11. Evaluar si un número es positivo, negativo o cero
    public static void ejercicio11() {
        int numero9 = 0;
        if (numero9 > 0) {
            System.out.println("El número es positivo.");
        } else if (numero9 < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }

    // 12. Si se puede acceder a un evento (mayoría de edad y entrada)
    public static void ejercicio12() {
        int edadEvento = 20;
        boolean tieneEntrada = true;
        if (edadEvento >= 18 && tieneEntrada) {
            System.out.println("Puedes acceder al evento.");
        } else {
            System.out.println("No puedes acceder al evento.");
        }
    }

    // 13. Verificar si un número es divisible entre 3 y 5
    public static void ejercicio13() {
        int numero10 = 15;
        if (numero10 % 3 == 0 && numero10 % 5 == 0) {
            System.out.println("El número es divisible entre 3 y 5.");
        } else {
            System.out.println("El número no es divisible entre 3 y 5.");
        }
    }

    // 14. Comprobar si un número no está en rango
    public static void ejercicio14() {
        int numero11 = 150;
        if (numero11 < 10 || numero11 > 100) {
            System.out.println("El número no está en el rango.");
        } else {
            System.out.println("El número está en el rango.");
        }
    }

    // 15. El mayor de tres números
    public static void ejercicio15() {
        int numero12 = 5, numero13 = 10, numero14 = 8;
        int mayor = Math.max(numero12, Math.max(numero13, numero14));
        System.out.println("El mayor número es: " + mayor);
    }

    // 16. Verificar si una persona puede votar (edad = 18)
    public static void ejercicio16() {
        int edadVoto = 18;
        if (edadVoto >= 18) {
            System.out.println("La persona puede votar.");
        } else {
            System.out.println("La persona no puede votar.");
        }
    }

    // 17. Clasificar un número como positivo par, positivo impar, negativo par o negativo impar
    public static void ejercicio17() {
        int numero15 = -8;
        if (numero15 > 0) {
            if (numero15 % 2 == 0) {
                System.out.println("El número es positivo y par.");
            } else {
                System.out.println("El número es positivo e impar.");
            }
        } else if (numero15 < 0) {
            if (numero15 % 2 == 0) {
                System.out.println("El número es negativo y par.");
            } else {
                System.out.println("El número es negativo e impar.");
            }
        } else {
            System.out.println("El número es cero.");
        }
    }

    // 18. Validar si una persona tiene acceso VIP (edad 21 o paga extra)
    public static void ejercicio18() {
        int edadVIP = 21;
        boolean pagaExtra = true;
        if (edadVIP >= 21 || pagaExtra) {
            System.out.println("La persona tiene acceso VIP.");
        } else {
            System.out.println("La persona no tiene acceso VIP.");
        }
    }

    // 19. Evaluar si dos variables booleanas son verdaderas
    public static void ejercicio19() {
        boolean var1 = true, var2 = true;
        if (var1 && var2) {
            System.out.println("Ambas variables son verdaderas.");
        } else {
            System.out.println("Al menos una de las variables es falsa.");
        }
    }

    // 20. Clasificar la nota de un examen
    public static void ejercicio20() {
        int nota = 85;
        if (nota >= 90) {
            System.out.println("Excelente.");
        } else if (nota >= 75) {
            System.out.println("Notable.");
        } else if (nota >= 60) {
            System.out.println("Aprobado.");
        } else {
            System.out.println("Suspenso.");
        }
    }

    // 21. Si una letra es mayúscula
    public static void ejercicio21() {
        char letra1 = 'A';
        if (Character.isUpperCase(letra1)) {
            System.out.println("La letra es mayúscula.");
        } else {
            System.out.println("La letra no es mayúscula.");
        }
    }

    // 22. Verificar si una letra es minúscula
    public static void ejercicio22() {
        char letra2 = 'b';
        if (Character.isLowerCase(letra2)) {
            System.out.println("La letra es minúscula.");
        } else {
            System.out.println("La letra no es minúscula.");
        }
    }

    // 23. Validar si dos contraseñas son iguales
    public static void ejercicio23() {
        String password1 = "secreto";
        String password2 = "secreto";
        if (password1.equals(password2)) {
            System.out.println("Las contraseñas son iguales.");
        } else {
            System.out.println("Las contraseñas no son iguales.");
        }
    }

    // 24. Verificar si un número está dentro de varios rangos posibles
    public static void ejercicio24() {
        int numero16 = 45;
        if ((numero16 >= 10 && numero16 <= 30) || (numero16 >= 40 && numero16 <= 60)) {
            System.out.println("El número está en uno de los rangos.");
        } else {
            System.out.println("El número no está en ninguno de los rangos.");
        }
    }

    // 25. Llamar todos los ejercicios desde lo principal
    public static void ejercicio25() {
        System.out.println("Ejercicios completados.");
    }
}