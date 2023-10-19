import one.digitalinnovation.yugioh.MagoNegro;
import one.digitalinnovation.yugioh.Modo;
import one.digitalinnovation.yugioh.ModoAtaque;
import one.digitalinnovation.yugioh.ModoDefesa;

public class Main {

    public static void main(String[] args) {
        Modo ataque = new ModoAtaque();
        Modo defesa = new ModoDefesa();

        MagoNegro cartaMagoNegro = new MagoNegro();
        cartaMagoNegro.setModo(defesa);

        cartaMagoNegro.definirModo();
    }
}
