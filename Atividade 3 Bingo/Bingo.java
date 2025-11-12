import java.util.Random;

public class Bingo implements IBingo {

    private boolean[] numeros = new boolean[60]; // guarda se o número já foi sorteado

    // Sorteia um número ainda não sorteado
    @Override
    public int sortearNumero() {
        int numero = 0;
        if (contarNumerosSorteados() < 60) {
            while (true) {
                numero = new Random().nextInt(60);
                if (!numeros[numero]) {
                    numeros[numero] = true;
                    break;
                }
            }
        }
        return numero;
    }

    // Gera uma cartela com números únicos
    @Override
    public Cartela gerarCartela(int quantidadeNumeros) {
        int[] numerosCartela = new int[quantidadeNumeros];
        int numero;
        boolean sorteado;

        for (int i = 0; i < numerosCartela.length; i++) {
            while (true) {
                numero = new Random().nextInt(60) + 1;
                sorteado = false;
                for (int n : numerosCartela) {
                    if (numero == n) {
                        sorteado = true;
                        break;
                    }
                }
                if (!sorteado) break;
            }
            numerosCartela[i] = numero;
        }

        return new Cartela(numerosCartela);
    }

    // Exibe todos os números já sorteados
    @Override
    public void exibirBolasSorteadas() {
        System.out.print("Números sorteados: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
    }

    // Conta quantos números já foram sorteados
    @Override
    public int contarNumerosSorteados() {
        int quantidade = 0;
        for (boolean numero : numeros) {
            if (numero) quantidade++;
        }
        return quantidade;
    }

    // Verifica se um número específico já foi sorteado
    @Override
    public boolean checarSeUmNumeroJaFoiSorteado(int numero) {
        if (numero >= 1 && numero <= 60)
            return numeros[numero - 1];
        return false;
    }
}
