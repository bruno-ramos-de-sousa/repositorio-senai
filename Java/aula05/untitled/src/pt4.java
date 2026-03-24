import java.util.Scanner;

public class pt4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m, n;
        boolean negativo = false;

        System.out.println("Qual a quantidade de linhas da matriz?");
        m = scanner.nextInt();

        System.out.println("Qual a quantidade de colunas da matriz?");
        n = scanner.nextInt();

        int[][] matriz = new int[m][n];
        for (int l = 0; l < m; l++) {
            for (int c = 0; c < n; c++) {
                System.out.printf("Elemento [%d,%d]: ", l, c);
                matriz[l][c] = scanner.nextInt();
            }
        }
        System.out.println("VALORES NEGATIVOS");
        for (int l = 0; l < m; l++) {
            for (int c = 0; c < n; c++) {
                if (matriz[l][c] < 0) {
                    System.out.printf("%d\n", matriz[l][c]);
                    negativo = true;
                }
            }
        }
        if (!negativo) {
            System.out.println("""
                    -------------------------------------
                    ***** Não há números negativos ******
                    -------------------------------------
                    """);
        }
        System.out.println("""
                =====================================
                ===========Matriz completa===========
                =====================================
                """);
        for (int l = 0; l < m; l++) {
            for (int c = 0; c < n; c++) {
                System.out.print(matriz[l][c] + "|\t");
            }
            System.out.println("");
        }
        scanner.close();
    }
}
