import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = scanner.nextLine();
        }

        System.out.println("Aqui estão os nomes da lista: ");

        for (int x = 0; x < 5; x++) {
            System.out.println((x+1) + "º " + nomes[x]);
        }

    }
}