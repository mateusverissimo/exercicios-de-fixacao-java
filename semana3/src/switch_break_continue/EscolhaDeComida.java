package switch_break_continue;

import java.util.Locale;
import java.util.Scanner;

public class EscolhaDeComida {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int opcao = 0;

        do {
            System.out.print("1- Pizza\n2- Hamburguer\n3- Sushi\nEscolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu PIZZA!");
                    break;
                case 2:
                    System.out.println("Você escolheu HAMBURGUER!");
                    break;
                case 3:
                    System.out.println("Você escolheu SUSHI!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente");
            }
        } while (1 > opcao || opcao > 3); {
            System.out.println("Obrigado por escolher nossa cantina!");

            input.close();
        }
    }
}
