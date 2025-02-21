package operadores_unarios;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tentativas = 5;


        System.out.print("Login: ");
        String login = input.nextLine();

        System.out.println("senha: ");
        String senha = input.nextLine();

        boolean acesso = (login.equals("admin") && senha.equals("1234"));
        System.out.println("");
    }
}
