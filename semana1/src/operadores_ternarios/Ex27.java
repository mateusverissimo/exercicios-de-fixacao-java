package operadores_ternarios;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        String maiorDeIdade = idade >= 18 ?
                "maior de idade" : "menor de idade";

        System.out.printf("Você é %s.", maiorDeIdade);

        input.close();
    }
}
