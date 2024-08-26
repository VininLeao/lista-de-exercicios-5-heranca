public class TesteAdministrador {
    public static void main(String[] args) {
        Administrador admin1 = new Administrador("Roy Mustang", "Central City, HQ", "12345-6789", 5, 5000.0, 18.0, 700.0);
        Administrador admin2 = new Administrador("Riza Hawkeye", "Central City, HQ", "23456-7890", 8, 4500.0, 15.0, 400.0);

        System.out.println(admin1);
        System.out.println(admin2);

        admin1.setAjudaDeCusto(800.0);
        System.out.println("Novo salário total de " + admin1.getNome() + ": " + admin1.calcularSalario());
    }
}