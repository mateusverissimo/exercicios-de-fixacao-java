package For;

import java.util.Locale;
import java.util.Scanner;

public class SomarNumeros {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int soma = 0;

        System.out.print("Digite um número: ");
        int num = input.nextInt();


        for (int i = 1; i <= num; i++) {
            soma += i;
        }
        System.out.println("A soma de todos os números de 1 até " + num + " é: " + soma);
    }
}
