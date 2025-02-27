package For;

import java.util.Locale;
import java.util.Scanner;

public class ImprimirSequencia {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um número: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}
