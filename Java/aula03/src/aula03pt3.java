import java.util.Scanner;

public class aula03pt3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double nota;

        do {
            System.out.println("Digite uma nota entre 0 a 10: ");
            nota = in.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Valor incorreto!!!");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Correto");
    }
}
