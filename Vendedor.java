package Exercicios_Poli_Abs;

public class Vendedor extends Empregado {

    private double valorVendas;

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
    
    private double comissao;

    public Vendedor (String nom, String tel, String end, int codSetor, double salarioBase, double imposto, double valVendas, double comissao){
        super(nom, tel, end, codSetor, salarioBase, imposto);
        this.valorVendas = valVendas;
        this.comissao = comissao;
    }

    @Override
    public double calculoSalario(){
        return super.calculoSalario() + comissao;
    }

    @Override
    public String toString(){
        return super.toString() + "\nComissão: " + comissao + "\nSalário Vendedor: " + calculoSalario();
    }
}
