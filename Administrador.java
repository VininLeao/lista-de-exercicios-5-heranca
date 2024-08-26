public class Administrador extends Empregado {
    private double ajudaDeCusto;

    public Administrador() {
        super();
        this.ajudaDeCusto = 0.0;
    }

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        double salarioLiquido = super.calcularSalario();
        return salarioLiquido + ajudaDeCusto;
    }

    @Override
    public String toString() {
        return String.format("Administrador:\n Nome: %s\n Endereço: %s\n Telefone: %s\n Código Setor: %d\n Salário Base: %.2f\n Imposto: %.2f%%\n Ajuda de Custo: %.2f\n Salário Total: %.2f\n\n",
                getNome(), getEndereco(), getTelefone(), getCodigoSetor(), getSalarioBase(), getImposto(), ajudaDeCusto, calcularSalario());
    }
}
