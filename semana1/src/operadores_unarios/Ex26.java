package operadores_unarios;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tentativas = 5;
        String senha = "1234";

        System.out.println("Digite sua senha de 4 dígitos: ");

        System.out.println("Tentativas restantes: " + tentativas--);
        senha = input.nextLine();

        System.out.println("Tentativas restantes: " + tentativas--);
        senha = input.nextLine();

        System.out.println("Tentativas restantes: " + tentativas--);
        senha = input.nextLine();

        System.out.println("Tentativas restantes: " + tentativas--);
        senha = input.nextLine();

        System.out.println("Tentativas restantes: " + tentativas--);
        senha = input.nextLine();

        input.close();
    }
}
