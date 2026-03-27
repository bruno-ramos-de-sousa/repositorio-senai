import java.util.Scanner;

public class tstfor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = in.nextInt();

        for (int i = 1; i <= valor; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
