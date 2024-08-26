public class TesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("Jean Havoc", "Central City, HQ", "90123-4567", 18, 3200.0, 12.0, 25000.0, 8.0);
        Vendedor vendedor2 = new Vendedor("King Bradley", "Central City, HQ", "01234-5678", 22, 2900.0, 10.0, 20000.0, 7.0);

        System.out.println(vendedor1);
        System.out.println(vendedor2);

        vendedor1.setValorVendas(27000.0);
        vendedor1.setComissao(9.0);
        System.out.println("Novo salário total de " + vendedor1.getNome() + ": " + vendedor1.calcularSalario());
    }
}