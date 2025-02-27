package For;

import java.util.Locale;
import java.util.Scanner;

public class ExibirNumerosPares {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        for (int i = 0; i <= num; i += 2) {
            System.out.println(i);
        }
    }
}
