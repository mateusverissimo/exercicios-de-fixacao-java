package For;

import java.util.Locale;
import java.util.Scanner;

public class ContagemProgressiva {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }

    }
}
