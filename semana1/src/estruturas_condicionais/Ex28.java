package estruturas_condicionais;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para verificar se ele é positivo, negativo ou zero: ");
        int num = input.nextInt();

        if (num % 2 == 1) {
            System.out.println("Seu número é negativo!");
        } else if (num == 0) {
            System.out.println("Seu número é zero!");
        } else {
            System.out.println("Seu número é positivo!");
        }
        input.close();
    }
}
