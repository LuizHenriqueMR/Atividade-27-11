import java.util.Scanner;

public class Exercicio480 {
    public static boolean isCapicua(int numero) {
        String strNumero = String.valueOf(numero);
        String reverso = new StringBuilder(strNumero).reverse().toString();
        return strNumero.equals(reverso);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        if (isCapicua(numero)) {
            System.out.println(numero + " é um número capicua.");
        } else {
            System.out.println(numero + " não é um número capicua.");
        }

        scanner.close();
    }
}