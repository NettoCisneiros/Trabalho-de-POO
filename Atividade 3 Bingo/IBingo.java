public interface IBingo {
    public Cartela gerarCartela(int quantidadeNumeros);
    public int sortearNumero();
    public void exibirBolasSorteadas();
    public int contarNumerosSorteados();
    public boolean checarSeUmNumeroJaFoiSorteado(int numero);
}
