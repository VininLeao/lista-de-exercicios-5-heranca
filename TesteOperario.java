public class TesteOperario {
    public static void main(String[] args) {
        Operario operario1 = new Operario("Ling Yao", "Xing", "78901-2345", 12, 4000.0, 10.0, 60000.0, 6.0);
        Operario operario2 = new Operario("Lan Fan", "Xing", "89012-3456", 15, 3500.0, 8.0, 50000.0, 7.0);

        System.out.println(operario1);
        System.out.println(operario2);

        operario1.setValorProducao(65000.0);
        operario1.setComissao(7.0);
        System.out.println("Novo salário total de " + operario1.getNome() + ": " + operario1.calcularSalario());
    }
}