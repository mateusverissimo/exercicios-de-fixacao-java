package operadores_relacionais;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int a = input.nextInt();

        System.out.print("Digite o segundo valor: ");
        int b = input.nextInt();

        int maior = Math.max(a, b);

        System.out.println("O maior valor é: " + maior);

        input.close();
    }
}
