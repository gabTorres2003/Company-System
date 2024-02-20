package Exercicios_Poli_Abs;

public class Empregado extends Pessoa {

    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public Empregado (String nome, String tel, String end, int cod, double salBase, double imposto){
        super(nome, end, tel);
        this.codigoSetor = cod;
        this.salarioBase = salBase;
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
    public double calculoSalario(){
        return this.salarioBase - this.imposto;
    }

    @Override
    public String toString(){
        return super.toString() + "\nSalário Líquido: " + calculoSalario();
    }
}
