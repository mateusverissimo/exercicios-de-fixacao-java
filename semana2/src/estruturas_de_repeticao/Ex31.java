package estruturas_de_repeticao;

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador = 1;

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        while (contador <= num) {
            System.out.printf("%d\n", contador);
            contador++;
        }
    }
}
