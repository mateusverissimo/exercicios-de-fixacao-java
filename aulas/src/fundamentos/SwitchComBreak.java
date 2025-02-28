package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("");

        String conceito = "";
        System.out.print("Informe a nota: ");
        int nota = input.nextInt();

        conceito = switch (nota) {
            case 10, 9 -> "A";
            case 8, 7 -> "B";
            case 6, 5 -> "C";
            case 4, 3 -> "D";
            case 2, 1 -> "E";
            default -> "não informado!";
        };

        System.out.println("Conceito é " + conceito);
        input.close();

    }
}
