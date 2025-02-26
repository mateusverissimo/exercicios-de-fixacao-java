package operadores_relacionais;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int a = input.nextInt();

        System.out.print("Digite outro valor: ");
        int b = input.nextInt();

        System.out.println("O primeiro valor é maior ou igual ao segundo? " + (a >= b));
    }
}
