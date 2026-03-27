import java.util.Scanner;

public class tabuada_for {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int y;
        char pare;

        System.out.println("""
                --------------Sistema de tabuada automatico--------------
                ------------------------COM FOR--------------------------
                """);

        do {
            System.out.println("Digite o número que você deseja exibir a tabuada: ");
            y = in.nextInt();
            System.out.println("Aqui está a tabuada do " + y);
            for (int x = 0; x <= 10; x++) {
                System.out.println(y + " x " + x + " = " + (y*x));
            }
            System.out.println("Deseja exibir outra tela? [s]/[n]: ");
            pare = in.next().charAt(0);
        } while (pare != 'n');
        System.out.println("""
                Muito obrigado por acessar o sistema de tabuada automatico
                -----------------------Volte sempre-----------------------
                """);

    }
}
