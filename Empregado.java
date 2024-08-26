public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public Empregado() {
        super();
        this.codigoSetor = 0;
        this.salarioBase = 0.0;
        this.imposto = 0.0;
    }

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calcularSalario() {
        double salarioBruto = salarioBase;
        double valorImposto = salarioBase * (imposto / 100);
        return salarioBruto - valorImposto;
    }

    @Override
    public String toString() {
        return String.format("Empregado:\n Nome: %s\n Endereço: %s\n Telefone: %s\n Código Setor: %d\n Salário Base: %.2f\n Imposto: %.2f%%\n Salário Líquido: %.2f\n\n",
                getNome(), getEndereco(), getTelefone(), codigoSetor, salarioBase, imposto, calcularSalario());
    }
}