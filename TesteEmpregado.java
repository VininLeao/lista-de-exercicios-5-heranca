public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Edward Elric", "Resembool", "34567-8901", 10, 3500.0, 12.0);
        Empregado empregado2 = new Empregado("Alphonse Elric", "Resembool", "45678-9012", 20, 3000.0, 10.0);

        System.out.println(empregado1);
        System.out.println(empregado2);

        empregado1.setSalarioBase(4000.0);
        empregado1.setImposto(8.0);
        System.out.println("Novo salário líquido de " + empregado1.getNome() + ": " + empregado1.calcularSalario());
    }
}