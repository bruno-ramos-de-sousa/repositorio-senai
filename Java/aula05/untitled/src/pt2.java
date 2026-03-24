import java.util.Scanner;

public class pt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] teclado = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("""
                =====Acessando um valor especifico=====
                O valor no centro do teclado é\s""" + teclado[1][1] + """
                \n=====Imprimindo Matriz completa=====
                """);

        for (int linha = 0; linha < teclado.length; linha++) {
            for (int coluna = 0; coluna < teclado[linha].length; coluna++) {
                System.out.print(" | " + teclado[linha][coluna] + " | ");
            }
            System.out.println();
        }

        System.out.println("Mude os número do teclado: ");

        for (int linha = 0; linha < teclado.length; linha++) {
            for (int coluna = 0; coluna < teclado[linha].length; coluna++) {
                System.out.println("O número do telclado é " + teclado[linha][coluna] + ", digite o númeoro que voce deseja substituir: ");
                teclado[linha][coluna] = scanner.nextInt();
            }
        }
        System.out.println("\n=====Imprimindo Matriz completa=====");
        for (int linha = 0; linha < teclado.length; linha++) {
            for (int coluna = 0; coluna < teclado[linha].length; coluna++) {
                System.out.print(" | " + teclado[linha][coluna] + " | ");
            }
            System.out.println();
        }
    }
}
