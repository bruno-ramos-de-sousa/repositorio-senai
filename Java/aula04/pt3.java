public class pt3 {
    public static void main(String[] args) {
        String[] cores = {"Azul", "Amerelo", "Vermelho", "Verde", "Roxo"};

        System.out.println("A primeira cor é: " + cores[0]);
        System.out.println("A ultima cor é : " + cores[4]);
        System.out.println("\n Lista completa de Cores");

        for (int i = 0; i < cores.length; i++) {
            System.out.println("A cor na posição " + i + "º é: " + cores[i]);
        }
    }
}
