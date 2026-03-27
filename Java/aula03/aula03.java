import java.util.Scanner;

public class aula03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char resp;

        do {
            System.out.println("Digite a temperatura em Celcius: ");
            double c = in.nextDouble();
            double f = (c * 1.8) + 32;
            System.out.println("Temperatura em Fahrenheit: " + f);
            resp = in.next().charAt(0);
        } while (resp != 'n');
    }
}

