import java.sql.SQLOutput;
import java.util.Scanner;

public class desafioCasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;

        System.out.println("""
                ========================================================
                =============Sistema de soma entre matrizes=============
                ========================================================
                
                Qual a quantidade de linhas das matrizes para o calculo:
                """);
        m = scanner.nextInt();

        System.out.println("Qual a quantidade de colunas das matrizes: ");
        n = scanner.nextInt();

        int[][] a = new int[m][n];
        int[][] b = new int[m][n];
        int[][] c = new int[m][n];

        for (int l = 0; l < m; l++) {
            for (int co = 0; co < n; co++) {
                System.out.printf("Digite o valor da célula [%d][%d] na primeira matriz: ", l, co);
                a[l][co] = scanner.nextInt();
            }
        }
        for (int l = 0; l < m; l++) {
            for (int co = 0; co < n; co++) {
                System.out.printf("Digite o valor da célula [%d][%d] na segunda matriz: ", l, co);
                b[l][co] = scanner.nextInt();
            }
        }
        for (int l = 0; l < m; l++) {
            for (int co = 0; co < n; co++) {
                c[l][co] = a[l][co] + b[l][co];
            }
        }
        System.out.println("Aqui está a soma das duas matrizes: ");
        for (int l = 0; l < m; l++) {
            for (int co = 0; co < n; co++) {
                System.out.print(" | " + c[l][co] + " | ");
            }
            System.out.println();
        }
    }
}
