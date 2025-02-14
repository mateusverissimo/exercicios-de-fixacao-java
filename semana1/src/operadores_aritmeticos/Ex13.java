package operadores_aritmeticos;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();
        boolean resultado =  (num % 2 == 0) && true;
        System.out.println("O número é par: " + resultado);

        input.close();
    }
}
