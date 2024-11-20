import java.util.Scanner;

public class Exercicio490 {
    public static int removeCaracter(char[] vetor, char caractere) {
        int totalRemovidos = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == caractere) {
                vetor[i] = '*';
                totalRemovidos++;
            }
        }
        return totalRemovidos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        char[] vetor = new char[tamanho];

        System.out.println("Digite os caracteres do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.next().charAt(0);
        }

        System.out.print("Digite o caractere a ser removido: ");
        char caractere = scanner.next().charAt(0);

        int totalRemovidos = removeCaracter(vetor, caractere);
        System.out.println("Total de caracteres removidos: " + totalRemovidos);
        System.out.println("Vetor resultante:");
        for (char c : vetor) {
            System.out.print(c + " ");
        }

        scanner.close();
    }
}