public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public Operario() {
        super();
        this.valorProducao = 0.0;
        this.comissao = 0.0;
    }

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        double salarioLiquido = super.calcularSalario();
        double valorComissao = valorProducao * (comissao / 100);
        return salarioLiquido + valorComissao;
    }

    @Override
    public String toString() {
        return String.format("Operário:\n Nome: %s\n Endereço: %s\n Telefone: %s\n Código Setor: %d\n Salário Base: %.2f\n Imposto: %.2f%%\n Valor Produção: %.2f\n Comissão: %.2f%%\n Salário Total: %.2f\n\n",
                getNome(), getEndereco(), getTelefone(), getCodigoSetor(), getSalarioBase(), getImposto(), valorProducao, comissao, calcularSalario());
    }
}
