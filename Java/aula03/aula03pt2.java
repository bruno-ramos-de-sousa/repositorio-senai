import java.util.Scanner;

public class aula03pt2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cont = 0; float alt; int i = 0; int i2;

        System.out.println("Digite a quantidade de atletas que você deseja contar: ");
        i2 = in.nextInt();

        do {
            System.out.println("Digite a altura do atleta");
            alt = in.nextFloat();
            if (alt > 1.8) {
                cont++;
            }
            i++;
        } while (i < i2);
        System.out.println("A quantidade de atletas com a altura superior a 1,80m são " + cont);
    }
}
