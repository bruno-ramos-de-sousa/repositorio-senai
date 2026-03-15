void main() {
    Scanner leia = new Scanner(System.in);

    IO.println("Digite seu nome: ");
    String nome = leia.nextLine(); //nextLine entrada de dados do tipo texto

    IO.println("Digite sua idade: ");
    int idade = leia.nextInt();

    IO.println(nome + " você tem " + idade + " anos.");

}