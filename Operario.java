package Exercicios_Poli_Abs;

public class Operario extends Empregado {

    private double valorProducao;
    private double comissao;

    public Operario(String nom, String tel, String end, int codSetor, double salBase, double imposto, double com, double valProd){
        super(nom, tel, end, codSetor, salBase, imposto);
        this.valorProducao = valProd;
        this.comissao = com;
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
    public double calculoSalario(){
        return super.calculoSalario() + comissao;
    }
    @Override
    public String toString(){
        return super.toString() + "\nComissão: " + comissao + "\nSalário: " + calculoSalario();
    }
}
