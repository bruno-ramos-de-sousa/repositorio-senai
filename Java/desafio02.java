void main() {
    Scanner scanner = new Scanner(System.in);

    String sen1, email1;

    sen1 = "1234";
    email1 = "teste@gmail.com";

    IO.println("Você gostaria de realizar um login ou cadastro? ");
    String esc = scanner.nextLine();

    switch (esc) {
        case ("cadastro"):

            IO.println("----------Cadastro----------");
            IO.println("Digite seu email: ");
            String email2 = scanner.nextLine();

            IO.println("Digite sua senha: ");
            String sen2 = scanner.nextLine();

            IO.println("----------Login----------");

            IO.println("Digite seu e-mail: ");
            String email3 = scanner.nextLine();

            IO.println("Digite sua senha: ");
            String sen3 = scanner.nextLine();

            if (Objects.equals(sen3, sen2) && Objects.equals(email3, email2) || Objects.equals(email3, email1) && Objects.equals(sen3, sen1)) {
                IO.println("Logado com sucesso!!!!");

            } else {
                IO.println("Senha ou e-mail incorreto...");
            }
            break;
        case ("login"):
            IO.println("----------Login----------");
            IO.println("Digite seu email: ");
            String email4 = scanner.nextLine();

            IO.println("Digite sua senha: ");
            String sen4 = scanner.nextLine();

            if (Objects.equals(sen4, sen1) && Objects.equals(email4, email1)) {
                IO.println("Logado com sucesso!!!!");
            } else {
                IO.println("Senha ou e-mail incorreto...");
            }
            break;
    }
}
