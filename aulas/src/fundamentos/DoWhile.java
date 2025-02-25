package fundamentos;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        // do sentenca; ou {} while(...);

        Scanner input = new Scanner(System.in);

        String texto = "por favor";

        do {
            System.out.println("Você não tem acesso!");
            System.out.println("Quer sair? ");
            texto = input.nextLine();

        } while(!texto.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado!");
        input.close();
    }
}
