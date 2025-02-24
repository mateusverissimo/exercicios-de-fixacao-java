package operadores_logicos;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int num = input.nextInt();

            boolean dentroDoIntervalo = (num >= 10 && num <= 50);
            System.out.println("O número está dentro do intervalo [10, 50]: " + dentroDoIntervalo);

            input.close();
    }
}
