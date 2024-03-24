
import java.util.Scanner;

// Clase principal del juego
public class Juego {
    public static void main(String[] args) {
    SuperHeroe superman = new SuperHeroe("Superman", 10, 100);
    Villano lexLuthor = new Villano("Lex Luthor", 8, 80);

    while (superman.estaVivo() && lexLuthor.estaVivo()) {
        superman.atacarVillano(lexLuthor);
        if (lexLuthor.estaVivo()) {
            lexLuthor.atacarSuperHeroe(superman);
        }
    }

    if (superman.estaVivo()) {
        System.out.println("¡Superman ha derrotado a Lex Luthor y salvado el día!");
    } else {
        System.out.println("¡Lex Luthor ha derrotado a Superman y se ha apoderado del mundo!");
    }
}
    }

