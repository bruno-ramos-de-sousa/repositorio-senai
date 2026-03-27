import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomes[] = new String[5];
        float notas[][] = new float[5][4];
        float media[] = new float[5];

        for (int l = 0; l < 5; l++) {
            System.out.println("Digite o nome do aluno(a) número " + (l+1) + " de 5: ");
            nomes[l] = scanner.nextLine();
            for (int c = 0; c < 4; c++) {
                System.out.println("Digite a nota número " + (c+1) + " do aluno(a) " + nomes[l] + ": ");
                notas[l][c] = scanner.nextFloat();
                scanner.nextLine();
            }
            media[l] = (notas[l][0] + notas[l][1] + notas[l][2] + notas[l][3]) / 4;
        }
        for (int l = 0; l < 5; l++) {
            if (media[l] < 6) {
                System.out.println("O aluno(a) " + nomes[l] + " foi reprovado com média: " + media[l]);
            } else {
                System.out.println("O aluno(a) " + nomes[l] + " foi aprovado com média: " + media[l]);
            }
        }
        scanner.close();
    }
}
