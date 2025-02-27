package switch_break_continue;

import java.util.Locale;
import java.util.Scanner;

public class CorSemaforo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um número para o sinal de um semáforo " +
                "\n(1 - Vermelho /2 - Amarelo / 3 - Verde): ");
        int num = input.nextInt();

        switch(num) {
            case 1:
                System.out.println("Vermelho");
                break;
            case 2:
                System.out.println("Amarelo");
                break;
            case 3:
                System.out.println("Verde");
                break;
            default:
                System.out.println("Opção inválida");

        }
    }
}
