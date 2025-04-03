public class DB_MetodosYCondiciones {
    public static void main(String[] args) {
        // Método principal para ejecutar todos los ejercicios
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
    }

    // 1. Indica numéricamente (del 1 al 7) el día de la semana
    // Según el número que se muestra por pantalla, el día de la semana en palabras (Lunes, Martes, Miércoles...)
    public static void ejercicio1() {
        int numero = 3; // Cambiar para probar (1 = Lunes, 2 = Martes, etc.)
        String dia;

        switch (numero) {
            case 1: dia = "Lunes"; break;
            case 2: dia = "Martes"; break;
            case 3: dia = "Miércoles"; break;
            case 4: dia = "Jueves"; break;
            case 5: dia = "Viernes"; break;
            case 6: dia = "Sábado"; break;
            case 7: dia = "Domingo"; break;
            default: dia = "Número no válido"; break;
        }

        System.out.println("El día de la semana es: " + dia);
    }

    // 2. Calificación con letra
    // A = Excelente, B = Notable, C = Aprobado, D = Insuficiente
    public static void ejercicio2() {
        int puntuacion = 85; // Cambiar para probar
        String calificacion;

        if (puntuacion >= 90) {
            calificacion = "A (Excelente)";
        } else if (puntuacion >= 75) {
            calificacion = "B (Notable)";
        } else if (puntuacion >= 60) {
            calificacion = "C (Aprobado)";
        } else {
            calificacion = "D (Insuficiente)";
        }

        System.out.println("La calificación es: " + calificacion);
    }

    // 3. Menú de opciones: genera un menú para iniciar un juego
    // que tiene varias opciones:
    // 1 - Seleccionaste Nueva partida
    // 2 - Seleccionaste Cargar partida
    // 3 - Seleccionaste Salir
    // 4 - Opción inválida
    public static void ejercicio3() {
        int opcion = 2; // Cambiar para probar
        String mensaje;

        switch (opcion) {
            case 1: mensaje = "Seleccionaste Nueva partida"; break;
            case 2: mensaje = "Seleccionaste Cargar partida"; break;
            case 3: mensaje = "Seleccionaste Salir"; break;
            default: mensaje = "Opción inválida"; break;
        }

        System.out.println(mensaje);
    }

    // 4. Estación del año: verifica en qué estación estás
    // Declara una variable que contiene el nombre de la estación
    // Verificar el nombre de la estación y cuando se dé el caso correcto
    // Que se muestra por pantalla: "Estás en [estación]"
    public static void ejercicio4() {
        String estacion = "Verano"; // Cambiar para probar

        switch (estacion) {
            case "Primavera":
                System.out.println("Estás en Primavera.");
                break;
            case "Verano":
                System.out.println("Estás en Verano.");
                break;
            case "Otoño":
                System.out.println("Estás en Otoño.");
                break;
            case "Invierno":
                System.out.println("Estás en Invierno.");
                break;
            default:
                System.out.println("Estación no válida.");
                break;
        }
    }

    // 5. Tipo de figura geométrica
    // 3 - Triángulo
    // 4 - Cuadrado (o rectángulo)
    // 5 - Pentágono
    // 6 - Hexágono
    public static void ejercicio5() {
        int figura = 4; // Cambiar para probar (3 = Triángulo, 4 = Cuadrado, etc.)
        String tipoFigura;

        switch (figura) {
            case 3: tipoFigura = "Triángulo"; break;
            case 4: tipoFigura = "Cuadrado"; break;
            case 5: tipoFigura = "Pentágono"; break;
            case 6: tipoFigura = "Hexágono"; break;
            default: tipoFigura = "Figura desconocida"; break;
        }

        System.out.println("La figura es un: " + tipoFigura);
    }

    // 6. Tipo de moneda
    // USD - Dólar
    // EUR - Euro
    // GBP - Libra
    // JPY - Yen
    public static void ejercicio6() {
        String moneda = "EUR"; // Cambiar para probar
        String tipoMoneda;

        switch (moneda) {
            case "USD": tipoMoneda = "Dólar"; break;
            case "EUR": tipoMoneda = "Euro"; break;
            case "GBP": tipoMoneda = "Libra"; break;
            case "JPY": tipoMoneda = "Yen"; break;
            default: tipoMoneda = "Moneda no válida"; break;
        }

        System.out.println("El tipo de moneda es: " + tipoMoneda);
    }

    // 7. Número de mes: verificar el mes según su número (del 1 al 12)
    // Enero, Febrero, Marzo...
    public static void ejercicio7() {
        int mes = 3; // Cambiar para probar
        String nombreMes;

        switch (mes) {
            case 1: nombreMes = "Enero"; break;
            case 2: nombreMes = "Febrero"; break;
            case 3: nombreMes = "Marzo"; break;
            case 4: nombreMes = "Abril"; break;
            case 5: nombreMes = "Mayo"; break;
            case 6: nombreMes = "Junio"; break;
            case 7: nombreMes = "Julio"; break;
            case 8: nombreMes = "Agosto"; break;
            case 9: nombreMes = "Septiembre"; break;
            case 10: nombreMes = "Octubre"; break;
            case 11: nombreMes = "Noviembre"; break;
            case 12: nombreMes = "Diciembre"; break;
            default: nombreMes = "Mes no válido"; break;
        }

        System.out.println("El mes es: " + nombreMes);
    }

    // 8. Clasificación por edad y periodo escolar
    // de 3 a 5 años: Infantil
    // de 6 a 11 años: Primaria
    // de 12 a 15 años: ESO
    // de 16 a 17 años: Bachillerato
    // de 18 a 21 años: Universidad
    // de 22 en adelante: Persona formada
    public static void ejercicio8() {
        int edad = 20; // Cambiar para probar
        String periodoEscolar;

        if (edad >= 3 && edad <= 5) {
            periodoEscolar = "Infantil";
        } else if (edad >= 6 && edad <= 11) {
            periodoEscolar = "Primaria";
        } else if (edad >= 12 && edad <= 15) {
            periodoEscolar = "ESO";
        } else if (edad >= 16 && edad <= 17) {
            periodoEscolar = "Bachillerato";
        } else if (edad >= 18 && edad <= 21) {
            periodoEscolar = "Universidad";
        } else {
            periodoEscolar = "Persona formada";
        }

            System.out.println("La clasificación según edad es: " + periodoEscolar);
    }

    // 9. Letra del DNI para un número fijo
    // Para calcular la letra se divide el número del DNI entre 23 y el resto indica la letra, según la tabla
    public static void ejercicio9() {
        int dni = 12345678; // Cambiar para probar
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int resto = dni % 23;
        String letraDni = letras[resto];

            System.out.println("La letra del DNI es: " + letraDni);
    }

    // 10. Estado de un semáforo
    public static void ejercicio10() {
        String colorSemaforo = "Verde"; // Cambiar para probar
        String estado;

        switch (colorSemaforo) {
            case "Rojo": estado = "Detenerse"; break;
            case "Amarillo": estado = "Precaución"; break;
            case "Verde": estado = "Avanzar"; break;
            default: estado = "Color no válido"; break;
        }

            System.out.println("El semáforo está en color: " + colorSemaforo + " - " + estado);
    }
}