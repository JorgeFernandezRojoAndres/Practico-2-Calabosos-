
import java.util.Scanner;

// Clase principal del juego
public class Juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear dos superhéroes
        SuperHeroe marvelHeroe = new SuperHeroe("Iron Man", 20, 100);
        SuperHeroe capcomHeroe = new SuperHeroe("Ryu", 25, 100);

        System.out.println("¡Bienvenido a la batalla de Superhéroes!");

        // Loop principal del juego
        while (marvelHeroe.estaVivo() && capcomHeroe.estaVivo()) {
            System.out.println("\nTurno de Marvel: " + marvelHeroe.getNombre());
            System.out.println("Atacar a Capcom con cuánta fuerza? (0-" + marvelHeroe.getFuerza() + ")");
            int ataqueMarvel = scanner.nextInt();

            System.out.println("Turno de Capcom: " + capcomHeroe.getNombre());
            System.out.println("Atacar a Marvel con cuánta fuerza? (0-" + capcomHeroe.getFuerza() + ")");
            int ataqueCapcom = scanner.nextInt();

            // Aplicar daño
            capcomHeroe.recibirDanio(ataqueMarvel);
            marvelHeroe.recibirDanio(ataqueCapcom);

            // Mostrar estado de la batalla
            System.out.println("\nEstado de la batalla:");
            System.out.println("Marvel: Vida = " + marvelHeroe.getVida());
            System.out.println("Capcom: Vida = " + capcomHeroe.getVida());
        }

        // Determinar al ganador
        if (marvelHeroe.estaVivo()) {
            System.out.println("\n¡Marvel ha ganado la batalla!");
        } else {
            System.out.println("\n¡Capcom ha ganado la batalla!");
        }
    }
}
