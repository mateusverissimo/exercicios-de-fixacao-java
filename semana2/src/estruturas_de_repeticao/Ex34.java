package estruturas_de_repeticao;

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rep;

        do {
            System.out.print("Quantas vezes você deseja repetir a ação? ");
            rep = input.nextInt();
        } while (rep <= 0); {
            System.out.println("Você escolheu repetir " + rep + " vezes.");
            input.close();
        }
    }
}
