import java.util.Scanner;

public class ListaMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BancoDeDados banco = new BancoDeDados();

        int opcao;

        do {
            System.out.println("====== MENU ======");
            System.out.println("1 - Listar todas as pessoas");
            System.out.println("2 - Buscar pessoa por ID");
            System.out.println("3 - Buscar pessoa por nome");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    // LISTAR TODOS
                    banco.obterTodos().forEach(p -> {
                        System.out.println(p.toString());
                    });
                    break;

                case 2:
                    // BUSCAR POR ID
                    System.out.print("Digite o ID: ");
                    Integer id = sc.nextInt();

                    try {
                        Pessoa pessoa = banco.obterPorId(id);
                        System.out.println(pessoa.toString());
                    } catch (Exception e) {
                        System.out.println("Pessoa com esse ID não encontrada.");
                    }
                    break;

                case 3:
                    // BUSCAR POR NOME / STRING
                    System.out.print("Digite o nome ou parte dele: ");
                    String nome = sc.nextLine();

                    var pessoasFiltradas = banco.obterPorNome(nome);

                    if (pessoasFiltradas.isEmpty()) {
                        System.out.println("Nenhuma pessoa encontrada.");
                    } else {
                        pessoasFiltradas.forEach(p -> {
                            System.out.println(p.toString());
                        });
                    }
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println();

        } while (opcao != 0);

        sc.close();
    }
}
