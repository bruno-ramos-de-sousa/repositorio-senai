import java.util.Scanner;

public class pt5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] convidados = new String[5];
        int opcao;

        do {
            System.out.println("""
                    -----Escolha uma opção-----
                    (1) Cadastrar Convidado
                    (2) Listar Convidados
                    (3) Remover Convidados
                    (4) Sair do Sistema
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();


            switch (opcao) {
                case(1):
                    boolean cadastrou = false;
                    for (int i = 0; i < convidados.length; i++) {
                        if (convidados[i] == null) {
                            System.out.println("Digite o nome do convidado: ");
                            convidados[i] = scanner.nextLine();
                            System.out.println("Convidado adicionado com sucesso");
                            cadastrou = true;
                            break;
                        }
                    }
                    if (!cadastrou) {
                        System.out.println("A lista está cheia! E não comporta mais convidados");
                    }
                    break;
                case(2):
                    System.out.println("Lista Atual");
                    boolean temGente = false;

                    for (int i = 0; i < convidados.length; i++) {
                        if (convidados[i] != null) {
                            System.out.println("- " + convidados[i]);
                            temGente = true;
                        }
                    }
                    if (!temGente) {
                        System.out.println("A lista está completamente vazia");
                    }
                    break;
                case(3):
                    System.out.println("Digite um nome para remover: ");
                    String nomeRemover = scanner.nextLine();
                    boolean removeu = false;

                    for (int i = 0; i < convidados.length; i++) {
                        if (convidados[i] != null && convidados[i].equalsIgnoreCase(nomeRemover)) {
                            convidados[i] = null;
                            System.out.println("Convidado removido com sucesso");
                            removeu = true;
                            break;
                        }
                    }
                    if (!removeu) {
                        System.out.println("Nome não encontrado na lista");
                    }
                    break;
                case(4):
                    System.out.println("Saindo do sistema");
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;
            }
        } while (opcao != 4);
    }
}
