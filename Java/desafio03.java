void main() {
    Scanner scanner = new Scanner(System.in);

    int dimdim;

    IO.println("***Sistema informativo de sugestões***");
    IO.print("Quanto dinheiro você tem sobrando???  R$");
    dimdim = scanner.nextInt();

    if (dimdim >= 50) {
        IO.println("Vá ao cinema agora!!!");
    } else {
        IO.println("Fique em casa vendo tv!!!");
    }
}
