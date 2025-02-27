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

        switch(nota) {
            case 10: case 9:
                conceito = "A";
                break;
            case 8: case 7:
                conceito = "B";
                break;
            case 6: case 5:
                conceito = "B";
            case 6: case 5:
                conceito = "B";
            case 6: case 5:
                conceito = "";
                break;
            default:
                conceito = "não informado!";
        }

        System.out.println("Conceito é " + conceito);
        input.close();

    }
}
