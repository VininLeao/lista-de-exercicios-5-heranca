public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public Vendedor() {
        super();
        this.valorVendas = 0.0;
        this.comissao = 0.0;
    }

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
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
        double valorComissao = valorVendas * (comissao / 100);
        return salarioLiquido + valorComissao;
    }

    @Override
    public String toString() {
        return String.format("Vendedor:\n Nome: %s\n Endereço: %s\n Telefone: %s\n Código Setor: %d\n Salário Base: %.2f\n Imposto: %.2f%%\n Valor Vendas: %.2f\n Comissão: %.2f%%\n Salário Total: %.2f\n\n",
                getNome(), getEndereco(), getTelefone(), getCodigoSetor(), getSalarioBase(), getImposto(), valorVendas, comissao, calcularSalario());
    }
}
