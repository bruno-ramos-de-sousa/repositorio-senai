void main() {

    Scanner scanner = new Scanner(System.in);

    int cont = 0, rep = 0;

    IO.println("----------Calculadora com Java----------");

    while (rep <= 0) {
        IO.println("Quantas repetições você deseja realizar: ");
        rep = scanner.nextInt();
    }
        while (cont < rep) {

            IO.println("Digite o primeiro número: ");
            int n1 = scanner.nextInt();

            IO.println("Digite o segundo número: ");
            int n2 = scanner.nextInt();

            IO.println("Digite a operação que você deseja realizar ( + | - | * | / )");
            char op = scanner.next().charAt(0);

            double result;
            result = 0;

            if (op == '/' && n2 == 0) {
                IO.println("-------Não se deve dividir por 0------");
                IO.println("----------Operação Invalida-----------");
            } else {
                switch (op) {
                    case ('+'):
                        result = (n1 + n2);
                        break;
                    case ('-'):
                        result = (n1 - n2);
                        break;
                    case ('*'):
                        result = (n1 * n2);
                        break;
                    case ('/'):
                        result = ((float) n1 / n2);
                        break;
                }
                IO.println("O resultado dessa equação é: " + result);
            }
            cont++;
        }
    }


