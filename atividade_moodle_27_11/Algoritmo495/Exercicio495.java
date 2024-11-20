import java.util.Arrays;
import java.util.Scanner;

public class Exercicio495 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de nomes: ");
        int n = scanner.nextInt();
        String[] nomes = new String[n];

        System.out.println("Digite os nomes:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.next();
        }

        Arrays.sort(nomes);

        System.out.println("Nomes ordenados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}