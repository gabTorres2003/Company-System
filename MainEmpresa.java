package Exercicios_Poli_Abs;

public class MainEmpresa {
    public static void main(String[] args) {
        Fornecedor f1 = new Fornecedor("(22992052215)", "Luis Suarez", "Rua Andre Luiz, 64", 1500, 860);

        System.out.println("Dados Fornecedor \n" + f1.toString());

        Empregado e1 = new Empregado("Jorginho", "21998563458", "Nossa S. de Ipanema", 1565, 15750, 2500);

        System.out.println("\nDados Empregado \n" + e1.toString());

        Administrador a1 = new Administrador("Neymito", "21992978634", "St Etienne", 77475, 456200856, 45000, 8000);

        System.out.println("\nDados Administrador\n" + a1.toString());

        Operario o1 = new Operario("Sandrao", "21998546321", "Rua Lion Noa", 1415, 3200, 1000, 2500, 50000);

        System.out.println("\nDados do Operário\n" + o1.toString());
    }
}
