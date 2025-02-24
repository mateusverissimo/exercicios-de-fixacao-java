package operadores_logicos;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        boolean positivo = (num > 0);
        boolean negativo = (num < 0);
        boolean zero = (num == 0);

        System.out.println("O número é positivo: " + positivo);
        System.out.println("O número é negativo: " + negativo);
        System.out.println("O número é zero: " + zero);

        input.close();
    }
}
