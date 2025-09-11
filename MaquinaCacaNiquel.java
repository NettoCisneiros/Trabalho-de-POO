import java.util.*;

public class MaquinaCacaNiquel {
    private double apostaMinima;
    private List<Rolo> rolos;
    private double premioAtual;

    public MaquinaCacaNiquel(double apostaMinima, List<Rolo> rolos) {
        this.apostaMinima = apostaMinima;
        this.rolos = rolos;
    }

    public List<Simbolo> girar() {
        List<Simbolo> resultado = new ArrayList<>();
        for (Rolo r : rolos) {
            resultado.add(r.girar());
        }
        return resultado;
    }

    public boolean verificarResultado(List<Simbolo> simbolos) {
        Simbolo primeiro = simbolos.get(0);
        for (Simbolo s : simbolos) {
            if (!s.getNome().equals(primeiro.getNome())) {
                return false;
            }
        }
        premioAtual = primeiro.getValor() * 10;
        return true;
    }

    public void pagarPremio(Jogador j) {
        j.receberPremio(premioAtual);
        premioAtual = 0;
    }
}