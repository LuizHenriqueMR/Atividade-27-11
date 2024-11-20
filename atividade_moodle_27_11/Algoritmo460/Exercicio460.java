import java.util.Scanner;

public class Exercicio460 {
    public static int calculaDobro(int numero) {
        return numero * 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            System.out.println("Dobro: " + calculaDobro(numero));
        }

        scanner.close();
    }
}