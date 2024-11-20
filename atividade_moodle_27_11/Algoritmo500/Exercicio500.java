import java.util.Scanner;

public class Exercicio500 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        while (true) {
            System.out.println("VETORES");
            System.out.println("1. Dados do VETOR A");
            System.out.println("2. Dados do VETOR B");
            System.out.println("3. Imprime VETORES");
            System.out.println("4. Soma VETORES");
            System.out.println("5. Subtrai VETORES");
            System.out.println("6. Sai do programa");
            System.out.print("OPÇÃO: ");
            int opcao = scanner.nextInt();

            if (opcao == 6) {
                System.out.println("Encerrando o programa.");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite os elementos do vetor A:");
                    for (int i = 0; i < vetorA.length; i++) {
                        System.out.print("Elemento " + (i + 1) + ": ");
                        vetorA[i] = scanner.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Digite os elementos do vetor B:");
                    for (int i = 0; i < vetorB.length; i++) {
                        System.out.print("Elemento " + (i + 1) + ": ");
                        vetorB[i] = scanner.nextInt();
                    }
                    break;
                case 3:
                    System.out.print("Vetor A: ");
                    for (int num : vetorA) System.out.print(num + " ");
                    System.out.println();
                    System.out.print("Vetor B: ");
                    for (int num : vetorB) System.out.print(num + " ");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Soma dos vetores:");
                    for (int i = 0; i < vetorA.length; i++) {
                        System.out.println("Posição " + i + ": " + (vetorA[i] + vetorB[i]));
                    }
                    break;
                case 5:
                    System.out.println("Subtração dos vetores:");
                    for (int i = 0; i < vetorA.length; i++) {
                        System.out.println("Posição " + i + ": " + (vetorA[i] - vetorB[i]));
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}