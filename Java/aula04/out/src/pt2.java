import java.util.Scanner;

public class pt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] n = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            n[i] = scanner.nextInt();
        }

        System.out.println("Os números digitados foram: ");

        for (int i = 0; i < 10; i++) {
            System.out.println("O " + (i+1) + "º número digitado foi " + n[i]);
        }
    }
}
