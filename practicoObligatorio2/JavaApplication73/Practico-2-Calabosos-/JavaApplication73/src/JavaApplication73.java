import java.util.Scanner;

// Clase para representar a los Superhéroes
class SuperHeroe {
    private String nombre;
    private int fuerza;
    private int vida;

    public SuperHeroe(String nombre, int fuerza, int vida) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getVida() {
        return vida;
    }

    public void recibirDanio(int danio) {
        vida -= danio;
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}

