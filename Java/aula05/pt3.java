import java.util.Random;

public class pt3 {
    public static void main(String[] args) {

        int[][] cartela = new int[5][5];
        Random sorteador = new Random();
        int contador = 0; int contador2 = 15;

        for (int linha = 0; linha < cartela.length; linha++) {
            for (int coluna = 0; coluna < cartela[linha].length; coluna++) {
                cartela[linha][coluna] = sorteador.nextInt(contador, contador2) + 1;
                contador += 15;
                contador2 += 15;
            }
            contador = 0;
            contador2 = 15;
        }

        System.out.print("""
                ===================================
                B\t\tI\t\tN\t\tG\t\tO
                ===================================
                """);

        for (int linha = 0; linha < cartela.length; linha++) {
            for (int coluna = 0; coluna < cartela[linha].length; coluna++) {
                System.out.print(cartela[linha][coluna] + "\t\t");
            }
            System.out.println();
            System.out.println("-----------------------------------");
        }
    }
}
