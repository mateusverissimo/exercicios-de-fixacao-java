package operadores_unarios;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String senha = "1234";
        int tentativas = 5;

        while (tentativas > 0) {
            System.out.print("Digite sua senha: ");
            if (input.next().equals(senha)) {
                System.out.println("Login bem-sucedido!");
                break;
            }
            tentativas--;
            System.out.println("Senha incorreta. Tentativas restantes: " + tentativas);
        }

        if (tentativas == 0) {
            System.out.println("Você excedeu o número de tentativas. Acesso bloqueado.");
        }

        input.close();
    }
}

