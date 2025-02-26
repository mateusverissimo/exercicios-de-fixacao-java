package estruturas_de_repeticao;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soma = 0;
        int cont = 1;

        System.out.println("Digite um número: ");
        int num = input.nextInt();

        while (cont <= num) {
            soma += cont;
            cont++;
        }
        System.out.println("A soma de todos os números inteiros até " + num + " é: " + soma);
    }
}
