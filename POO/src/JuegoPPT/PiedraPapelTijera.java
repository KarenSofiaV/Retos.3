package JuegoPPT;
import java.util.Scanner;
import java.util.Random;
public class PiedraPapelTijera implements Juego {
    Scanner lectura = new Scanner(System.in);
    private int puntajeUsuario;
    private int puntajeComputadora;
    private Random random;
    private String nombreJugador;

    public PiedraPapelTijera() {
        puntajeUsuario = 0;
        puntajeComputadora = 0;
       
        random = new Random();
    }
    public int getPuntajeUsuario() {
        return puntajeUsuario;
    }

    public int getPuntajeComputadora() {
        return puntajeComputadora;
    }

    public void iniciar() {
        System.out.println("¡Bienvenido al juego Piedra, Papel o Tijera!");
        System.out.println("Ingrese el nombre del Jugador");
        nombreJugador=lectura.next();
        System.out.println("Cada ronda, elija una opción:");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
    }
    public void jugar() {
        int opcionUsuario;
        do {
            System.out.print("Ingrese su opción (1-3): ");
            opcionUsuario = lectura.nextInt();
        } while (opcionUsuario < 1 || opcionUsuario > 3);

        int opcionComputadora = random.nextInt(3) + 1;
        System.out.println("La computadora eligió: " + opcionComputadora);

        if (opcionUsuario == opcionComputadora) {
            System.out.println("¡Empate!");
        } else if ((opcionUsuario == 1 && opcionComputadora == 3)
                || (opcionUsuario == 2 && opcionComputadora == 1)
                || (opcionUsuario == 3 && opcionComputadora == 2)) {
            System.out.println("¡Ganaste!");
            puntajeUsuario++;
        } else {
            System.out.println("¡Perdiste!");
            puntajeComputadora++;
        }
    }
    public void finalizar() {
        System.out.println("Juego terminado.");
        System.out.println("Puntajes finales:");
        System.out.println("Usuario: " + puntajeUsuario);
        System.out.println("Computadora: " + puntajeComputadora);
        lectura.close();
    }
}