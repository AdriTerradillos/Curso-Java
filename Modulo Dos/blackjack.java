import java.util.Random;
import java.util.Scanner;

public class blackjack {

// 1 Mazo de cartas:
static String[] deck = new String[52]; // almaceno el número total de cartas / elementos en Array deck
static int deckIndex = 0;

    public static void main(String[] args) {
        // Crear un Scanner 
        Scanner sc = new Scanner(System.in); // Scanner para la entrada del usuario
   
        // ➡︎ 1. CREAR BARAJA Y MAZO --> VARIABLES GLOBALES ⬅︎ (creo dos variables con método, realizado abajo del todo)
        crearBaraja(); // Genera 52 cartas
        barajarMazo(deck); // baraja aleatoriamente el mazo
        

        // ➡︎ 2. DECLARAR MANOS DE JUGADOR Y DEALER ⬅︎
        String[] manoJugador = new String[12]; // Creo un array que contiene un máximo de 12 cartas por mano (o elementos)
        int cartasJugador = 0; // inicio el contador desde 0


        // ➡︎ 3. REPARTO INICIAL CARTAS (Con bucles) ⬅︎
        String[] manoDealer = new String[12]; // Creo un segundo array que contiene un máximo de 12 cartas por mano (o elementos)
        int cartasDealer = 0; // inicio el contador desde 0 

        // BUCLE FOR Loop --> Colectivo
        // Primera iteración. Repartir una primera carta al Jugador y al Dealer
        for (int i = 0; i < 2; i++) 
        { // Primer ciclo. Repetimos el ciclo 2 veces, una vez por cada carta | comienza con 0 y aumenta en cada iteración, hasta llegar a dos (i < 2)--> Jugador y Dealer

            // Primera carta para el jugador (recorre la posición 0 de su mano --> primer elemento)
            manoJugador[cartasJugador] = repartirCarta(); // reparte una carta al jugador en la posición cartasJugador
            cartasJugador++; // incrementa el contador de cartas del jugador (hasta 2)

            // Primera carta para el dealer (recorre la posición 0 de su mano --> primer carta / elemento)
            manoDealer[cartasDealer] = repartirCarta();
            cartasDealer++; // incrementa el contador de cartas de dealer (hasta 2)
        }

        // BUCLE FOR --> Individual 
        // Mostrar los resultados
        
            System.out.println("Mano del jugador: ");
        for (int i = 0; i <cartasJugador; i++) // bucle que recorre todas las cartas que tiene el Jugador en su mano | Primera carta del array[0] en iteración 0 para Jugador, es la primera carta del array
        {
            System.out.println(manoJugador[i]); // imprime el mensaje de la carta del Jugador que se encuentra en la posición 0, osea, la primera carta y así sucesivamente (i++)
        }

            System.out.println("Mano del dealer: ");
        for (int i = 0; i < cartasDealer; i++) // bucle que recorre todas las cartas que tiene el Jugador en su mano | Primera carta del array[0] en iteración 0 para Dealer, es la primera carta del array
        { 
            System.out.println(manoDealer[i]); // imprime el mensaje de la carta que se encuentra en la posición 0, osea, la primera carta del Dealer y así sucesivamente (i++)
        }    

        // ➡︎ 4. MOSTRAR CARTAS INICIALES ⬅︎
            System.out.println("\n=== BLACKJACK ==="); // muestra título en la consola
            System.out.println("Tus cartas: ");
        printMano(manoJugador, cartasJugador); // Muestra las cartas del Jugador (se invoca el método printMano pasando dos parámetros: manoJugador y cartasJugador) Generar metodo en una clase privada abajo

            // Declaro variable para Jugador (calculo valor cartas)
            int valorJugador = calcularValorMano(manoJugador, cartasJugador);
                System.out.println("Total: " + valorJugador);

                System.out.println("\n Carta visible del dealer: ");
                System.out.println(manoDealer[0]); // Solo se muestra la primera carta del dealer --> la carta visible
                System.out.println("La otra carta está oculta");


        // ➡︎ 5. TURNO DEL JUGADOR ⬅︎
            // Declarar variable nueva 
            boolean jugadorPlantado = false; // ( nombre de variable boolean: el jugador se planta será false)

        // Bucle while: se repite mientras (Condición 1: Jugador no se plante y (AND / &&) Condición 2: no se pase de 21)
        while (!jugadorPlantado && valorJugador < 21) 
        {
                System.out.println("\n ¿Deseas pedir carta (hit) o plantarte (stand)? "); // Busca hacer tomar una decisión al usuario (continuar o plantarse)
            String respuesta = sc.nextLine().toLowerCase(); // transforma las letras a minúsculas e imprime el mensaje del Jugador
            

            // Condicional para procesar la respuesta del jugador
            if (respuesta.equals("hit")) 
            { // si el nombre de variable "respuesta" es igual a "hit"...
                // El jugador pide una carta
                manoJugador[cartasJugador] = repartirCarta();
                cartasJugador++; // (i + 1) almacena una nueva iteración ó carta para jugador
                valorJugador = calcularValorMano(manoJugador, cartasJugador);

                    System.out.println("Has recibido: " + manoJugador[cartasJugador - 1]); // imprime la carta recién recibida por el Jugador
                printMano(manoJugador, cartasJugador); // imprime todas las cartas que tiene el Jugador en la mano hasta cartasJugador (las que tiene en realidad)
                // Si se pasa de 21 se termina la partida
                if (valorJugador > 21) 
                {
                    System.out.println("Te has pasado de 21. ¡Has perdido! ☹︎ ");
                    return; // devuelve el mensaje y finaliza el juego en caso de que el Jugador se pasa de 21
                }
            
            } else if (respuesta.equals("stand")) {
                jugadorPlantado = true; // El jugador se planta, termina su turno
                } else {
                    System.out.println("Opción no válida. Escribe 'hit' o 'stand'. ");
                }
            
        }

        // ➡︎ TURNO DEL DEALER ⬅︎
            System.out.println("=== TURNO DEL DEALER ===");
            System.out.println("Cartas del dealer: ");
            printMano(manoDealer, cartasDealer);

            int valorDealer = calcularValorMano(manoDealer, cartasDealer);
            System.out.println("Total " + valorDealer);

        // Bucle: El dealer roba cartas hasta llegar a 17 o más
        while (valorDealer < 17) 
        {
                System.out.println("El dealer coge cartas...");
            manoDealer[cartasDealer] = repartirCarta();
            cartasDealer++; // almacena una nueva iteración (i + 1) ó carta para dealer
            // Condicional para procesar la respuesta del dealer
            
            printMano (manoDealer, cartasDealer);
            valorDealer = calcularValorMano(manoDealer, cartasDealer);
                System.out.println("Total: " + valorDealer);
        }


        // ➡︎ MOSTRAR RESULTADOS FINALES ⬅︎
            System.out.println("\n Resultado Final 🥁...");
            System.out.println("Tu mano; ");
        printMano(manoJugador, cartasJugador);
            System.out.println("Total jugador " + valorJugador);

            System.out.println("\n Mano del dealer: ");
        printMano(manoDealer, cartasDealer);
            System.out.println("Total dealer: " + valorDealer);


        // Condicionales para determinar el resultado
        if (valorJugador > 21) 
        {
            System.out.println("Te has pasado. Gana el dealer");
        } else if (valorDealer > 21) {
            System.out.println("El dealer se ha pasado. ¡Ganaste!");
        } else if (valorJugador > valorDealer) {
            System.out.println("¡Ganaste!");
        } else if (valorJugador < valorDealer) {
            System.out.println("Gana el dealer");
        } else {
            System.out.println("¡Empate!");
        }
        sc.close();
    }

    


    // ➡︎ MÉTODO: CREAR BARAJA ⬅︎
        public static void crearBaraja() 
        {
            String[] palos = {"♦︎", "♣︎", "♠︎", "♥︎"};
            String[] rangos = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

            int index = 0; // iteración comienza desde posición 0
            // Doble bucle: uno para palos, otro para rangos
            for (int i = 0; i < palos.length; i++) 
            {
                for (int j = 0; j < rangos.length; j++) 
                {
                    deck[index] = rangos[j] + palos[i];
                    index ++; // Anexión de palos y rangos (números con figuras), Suma iteración cada vez en 1
                }
            }
        }

        // ➡︎ MÉTODO: BARAJAR MAZO ⬅︎
        public static void barajarMazo(String[] mazo) 
        {
            Random rand = new Random();
            // aplicar bucle for 
            for (int i = mazo.length - 1; i > 0; i--) 
            {
                String temp = mazo[i];
                int j = rand.nextInt(i + 1);
                mazo [i] = mazo[j];
                mazo[j] = temp;
            }
        }

    // ➡︎ MÉTODO: REPARTIR CARTA ⬅︎
    public static String repartirCarta() {
        // Condición if
       
        
        if (deckIndex >= deck.length) {
            System.out.println("No quedan más cartas en el mazo. ");
            return null;
        }
        String carta = deck[deckIndex];
        deckIndex++;
        return carta;
    }

    // ➡︎ MÉTODO: CALCULAR VALOR DE MANO ⬅︎
    public static int calcularValorMano(String[] mano, int numCartas) {
        int total = 0;
        int ases = 0;

        // Bucle for
        for (int i = 0; i < numCartas; i++) 
        {
            String carta = mano[i];
            String valor = carta.substring(0, carta.length()- 1); // Elimina el símbolo

            if (valor.equals("A")) // si el valor es igual a "A"...
            {
                total += 11; // el valor total de A será de 11 puntos
                ases++; // iteración de ases (en adicción)

            } else if (valor.equals("K") || valor.equals("Q") || valor.equals("J")) 
            {
                total += 10;
            } else {
                total += Integer.parseInt(valor);
            }
        }
        
        // Ajuste de ases si se pasa de 21
        while (total > 21 && ases > 0) 
        {
            total -= 10;
            ases--;
        }
        return total;
    }

    // ➡︎ MÉTODO: IMPRIMIR MANO ⬅︎
    public static void printMano(String[] mano, int numCartas) {
        // Bucle for
        for (int i = 0; i < numCartas; i++) 
        {
            System.out.print(mano[i] + " ");
        }
        System.out.println(); 
    }
}