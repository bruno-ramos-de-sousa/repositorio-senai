public class pt4 {
    public static void main(String[] args) {
        double[] notas = {3.2, 6.4, 4.6, 7.0};
        double soma = 0;

        System.out.println("---- Notas Bimestrais ----");

        for (int i = 0; i < notas.length; i++) {
            System.out.println(i + 1 + "º Bimestre " + notas[i]);

            soma = soma + notas[i];
        }

        double media = soma / notas.length;
        System.out.println("--------------------------");
        System.out.println("Soma total = " + soma);
        System.out.println("Média final = " + media);
    }
}
