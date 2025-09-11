import java.util.*;

public class Cassino {
    private String nome;
    private List<Jogador> jogadores = new ArrayList<>();
    private List<MaquinaCacaNiquel> maquinas = new ArrayList<>();

    public Cassino(String nome) {
        this.nome = nome;
    }

    public void adicionarJogador(Jogador j) {
        jogadores.add(j);
    }

    public void adicionarMaquina(MaquinaCacaNiquel m) {
        maquinas.add(m);
    }

    public void iniciarJogo(Jogador j, MaquinaCacaNiquel m, double aposta) {
        if (j.apostar(aposta)) {
            List<Simbolo> resultado = m.girar();
            System.out.print("Resultado: ");
            for (Simbolo s : resultado) {
                System.out.print(s.getNome() + " ");
            }
            System.out.println();
            if (m.verificarResultado(resultado)) {
                System.out.println("Parabéns " + j.getNome() + "! Você ganhou!");
                m.pagarPremio(j);
            } else {
                System.out.println("Você perdeu, " + j.getNome() + "!");
            }
            System.out.println("Saldo atual: " + j.consultarSaldo());
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}