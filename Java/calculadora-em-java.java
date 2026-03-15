void main() {
    Scanner scanner = new Scanner(System.in);

    int cont;
    cont = 0;

    System.out.println("----------Calculadora com Java----------");

    System.out.println("Quantas repetições você deseja realizar: ");
    int rep = scanner.nextInt();

    while (cont < rep) {

        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        System.out.println("Digite a operação que você deseja realizar ( + | - | * | / )");
        char op = scanner.next().charAt(0);

        double result;
        result = 0;

        if (op == '/' && n2 == 0) {
            System.out.println("-------Não se deve dividir por 0------");
            System.out.println("----------Operação Invalida-----------");
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
                    result = (n1 / n2);
                    break;
            }
            System.out.println("O resultado dessa equação é: " + result);
            cont++;
        }
    }
}
