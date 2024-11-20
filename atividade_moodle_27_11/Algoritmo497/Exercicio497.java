import java.util.Scanner;
import java.util.Arrays;

public class Exercicio497 {
    public static int buscaBinaria(int[] vetor, int chave) {
        int inicio = 0, fim = vetor.length - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (vetor[meio] == chave) {
                return meio;
            } else if (vetor[meio] < chave) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        Arrays.sort(vetor);
        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));

        System.out.print("Digite o valor a ser buscado: ");
        int chave = scanner.nextInt();

        int posicao = buscaBinaria(vetor, chave);
        if (posicao != -1) {
            System.out.println("Chave encontrada na posição: " + posicao);
        } else {
            System.out.println("Chave não encontrada.");
        }

        scanner.close();
    }
}