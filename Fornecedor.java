package Exercicios_Poli_Abs;

public class Fornecedor extends Pessoa {

    private double valorCredito;
    private double valorDivida;

    public Fornecedor (String tel, String nome, String end, double valorC, double valorD){
        super(nome, end, tel);
        this.valorCredito = valorC;
        this.valorDivida = valorD;
    }
    public double getValorCredito() {
        return valorCredito;
    }
    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }
    public double getValorDivida() {
        return valorDivida;
    }
    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo(){
        return this.valorCredito - this.valorDivida;
    }

    @Override
    public String toString(){
        return super.toString() + "\nValor de Crédito: " + valorCredito + "\nValor da Dívida: " + valorDivida + "\nSaldo: " + obterSaldo();
    }
}
