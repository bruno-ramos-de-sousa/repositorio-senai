import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor para descobrir seu fatorial: ");
        int n = in.nextInt();
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("O factorial de " + n + " é " + factorial + "!!!");
    }
}
