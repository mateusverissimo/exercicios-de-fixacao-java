package switch_break_continue;

import java.util.Locale;
import java.util.Scanner;

public class NumImparesPares {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }
    }
}
