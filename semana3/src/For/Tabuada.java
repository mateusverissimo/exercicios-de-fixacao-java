package For;

import java.util.Locale;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um número para ver sua tabuada: ");
        int num = input.nextInt();

        for (int i = 1; 10 >= i; i++) {
            int tab = num * i;
            System.out.printf("\n%d x %d = %d", num, i, tab);
        }
    }
}
