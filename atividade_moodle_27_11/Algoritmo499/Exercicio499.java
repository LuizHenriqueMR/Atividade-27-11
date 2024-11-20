import java.util.Arrays;
import java.util.Scanner;

public class Exercicio499 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];

        while (true) {
            System.out.println("MENU VETOR - FUNÇÃO");
            System.out.println("1. Dados do VETOR");
            System.out.println("2. Ordena VETOR");
            System.out.println("3. Imprime VETOR");
            System.out.println("4. Sai do programa");
            System.out.print("OPÇÃO: ");
            int opcao = scanner.nextInt();

            if (opcao == 4) {
                System.out.println("Encerrando o programa.");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite os elementos do vetor:");
                    for (int i = 0; i < vetor.length; i++) {
                        System.out.print("Elemento " + (i + 1) + ": ");
                        vetor[i] = scanner.nextInt();
                    }
                    break;
                case 2:
                    Arrays.sort(vetor);
                    System.out.println("Vetor ordenado.");
                    break;
                case 3:
                    System.out.println("Vetor atual: " + Arrays.toString(vetor));
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}