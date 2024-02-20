package Exercicios_Poli_Abs;

public class Administrador extends Empregado {

    private double ajudaCusto;

    public Administrador (String nome, String tel, String end, int cod, double salBase, double imposto, double ajudaCusto){
        super(nome, tel, end, cod, salBase, imposto);
        this.ajudaCusto = ajudaCusto;
    }

    public double getAjudaCusto() {
        return ajudaCusto;
    }

    public void setAjudaCusto(double ajudaCusto) {
        this.ajudaCusto = ajudaCusto;
    }
    @Override
    public double calculoSalario(){
        return super.calculoSalario() + ajudaCusto;
    }

    @Override
    public String toString(){
        return super.toString() + "\nSalário Adm: " + calculoSalario();
    }
}
