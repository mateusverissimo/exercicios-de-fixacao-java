package estruturas_de_repeticao;

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rep = 0;

        do {
            System.out.print("Olá usuário! Como é seu nome? ");
            String nome = input.nextLine();

            System.out.print("Quantas vezes você deseja repetir seu nome? ");
            rep = input.nextInt();
        } while (rep >= 0) {
            System.out.println();
        }
    }
}
