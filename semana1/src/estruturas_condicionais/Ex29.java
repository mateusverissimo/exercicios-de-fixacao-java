package estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quanto você tirou na prova? ");
        double nota = input.nextDouble();

        if (10 >= nota && nota >= 7) {
            System.out.println("Aprovado!");
        } else if (7 > nota && nota >= 5) {
            System.out.println("Recuperação!");
        } else if (5 > nota && nota >= 0) {
            System.out.println("Reprovado!");
        } else {
            System.out.println("Nota inválida!");
        }
    }
}
