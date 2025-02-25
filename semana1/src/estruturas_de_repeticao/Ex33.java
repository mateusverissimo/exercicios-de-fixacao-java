package estruturas_de_repeticao;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String senha = "1234";

        do {
            System.out.println("Tente adivinhar a senha correta: ");
            senha = input.nextLine();
        } while (!senha.equalsIgnoreCase("1234"));

        System.out.println("Você acertou! A senha correta é 1234!");
        input.close();
    }
}
