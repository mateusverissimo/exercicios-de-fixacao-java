package switch_break_continue;

import java.util.Locale;
import java.util.Scanner;

public class MenuDeOpcoes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int opcao = 0;

        do {
            System.out.print("1. Exibir \"Ação 1\"\n" +
                    "2. Exibir \"Ação 2\"\n" +
                    "3. Exibir \"Ação 3\"\n" +
                    "4. Sair\n" +
                    "Selecione uma das opções: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Ação 1");
                    break;
                case 2:
                    System.out.println("Ação 2");
                    break;
                case 3:
                    System.out.println("Ação 3");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4); {
            System.out.println("Menu finalizado!");
        }
    }
}
