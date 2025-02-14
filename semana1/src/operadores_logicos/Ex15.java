package operadores_logicos;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        boolean maiorDeIdade = (idade >= 18);
        System.out.println("Maior de idade: " + maiorDeIdade);

        scanner.close();
    }
}
