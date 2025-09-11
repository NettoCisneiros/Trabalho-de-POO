import java.util.*;

public class Rolo {
    private List<Simbolo> simbolos;
    private Simbolo simboloAtual;

    public Rolo(List<Simbolo> simbolos) {
        this.simbolos = simbolos;
    }

    public Simbolo girar() {
        Random r = new Random();
        simboloAtual = simbolos.get(r.nextInt(simbolos.size()));
        return simboloAtual;
    }

    public Simbolo obterSimbolo() {
        return simboloAtual;
    }
}