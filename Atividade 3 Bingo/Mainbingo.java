import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bingo bingo = new Bingo();
        Cartela cartela = null;
        int opcao;

        System.out.println("=== BEM-VINDO AO JOGO DE BINGO ===");

        do {
            System.out.println("\nMENU:");
            System.out.println("1 → Sortear um novo número");
            System.out.println("2 → Exibir todos os números sorteados");
            System.out.println("3 → Gerar uma nova cartela");
            System.out.println("0 → Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    if (bingo.contarNumerosSorteados() < 60) {
                        int numero = bingo.sortearNumero();
                        System.out.println("Número sorteado: " + (numero + 1));
                    } else {
                        System.out.println("Todos os números já foram sorteados!");
                    }
                    break;

                case 2:
                    bingo.exibirBolasSorteadas();
                    System.out.println("Total de números sorteados: " + bingo.contarNumerosSorteados());
                    break;

                case 3:
                    System.out.print("Quantos números deseja na cartela? ");
                    int qtd = sc.nextInt();
                    if (qtd > 0 && qtd <= 60) {
                        cartela = bingo.gerarCartela(qtd);
                        cartela.exibirCartela();
                    } else {
                        System.out.println("Quantidade inválida! Digite entre 1 e 60.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o jogo... Obrigado por jogar!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
