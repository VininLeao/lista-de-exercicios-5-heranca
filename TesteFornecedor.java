public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor("Winry Rockbell", "Resembool", "56789-0123", 6000.0, 1000.0);
        Fornecedor fornecedor2 = new Fornecedor("Greed", "Ladonia", "67890-1234", 4000.0, 800.0);

        System.out.println(fornecedor1);
        System.out.println(fornecedor2);

        fornecedor1.setValorCredito(7000.0);
        fornecedor1.setValorDivida(1500.0);
        System.out.println("Novo saldo de " + fornecedor1.getNome() + ": " + fornecedor1.obterSaldo());
    }
}