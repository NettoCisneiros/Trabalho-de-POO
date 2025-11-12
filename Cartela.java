public class Cartela {
    private int[] numeros;

    public Cartela(int[] numeros) {
        this.numeros = numeros;
    }

    public void exibirCartela() {
        System.out.print("Cartela: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public int[] getNumeros() {
        return numeros;
    }
}
