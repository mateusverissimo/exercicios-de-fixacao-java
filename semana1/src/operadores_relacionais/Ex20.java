package operadores_relacionais;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = input.nextInt();

        System.out.println("A igualdade entre os números é: " + (a == b));

        input.close();
    }
}
