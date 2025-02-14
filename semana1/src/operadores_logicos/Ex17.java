package operadores_logicos;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o usuário: ");
        String usuario = input.nextLine();

        System.out.print("Digite a senha: ");
        String senha = input.nextLine();

        boolean acessoPermitido = (usuario.equals("admin") && senha.equals("1234"));
        System.out.println("Acesso permitido: " + acessoPermitido);

        input.close();
    }
}
