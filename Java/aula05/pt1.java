import java.util.Scanner;

public class pt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] pessoa = new String[3][2];

        System.out.println("============--- Cadastro de pessoas ---=============");
        for (int linha = 0; linha < pessoa.length; linha++) {
            System.out.println("Digite o nome da " + (linha + 1) + "ª pessoa: ");
            pessoa[linha][0] = scanner.nextLine();

            System.out.println("Digite a idade da " + (linha+1) + "ª pessoa");
            pessoa[linha][1] = scanner.nextLine();
            System.out.println("==================================================");
        }
        System.out.println("\n=============Tabela final de cadastro=============");
        System.out.println("NOME\t\tIDADE"); //\t tabulação

        for (int linha = 0; linha < pessoa.length; linha++) {
            System.out.println(pessoa[linha][0] + "\t\t" + pessoa[linha][1] + " anos!!!");
        }
    }
}