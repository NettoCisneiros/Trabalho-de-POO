import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Simbolo> simbolos = Arrays.asList(
                new Simbolo("🍒", 10),
                new Simbolo("🍋", 20),
                new Simbolo("🔔", 30),
                new Simbolo("⭐", 50)
        );

        List<Rolo> rolos = Arrays.asList(
                new Rolo(simbolos),
                new Rolo(simbolos),
                new Rolo(simbolos)
        );

        MaquinaCacaNiquel maquina = new MaquinaCacaNiquel(5, rolos);
        Cassino cassino = new Cassino("Cassino da Galera");

        Jogador j1 = new Jogador("Marcos", 100, 18);
        cassino.adicionarJogador(j1);
        cassino.adicionarMaquina(maquina);

        cassino.iniciarJogo(j1, maquina, 10);
    }

}
