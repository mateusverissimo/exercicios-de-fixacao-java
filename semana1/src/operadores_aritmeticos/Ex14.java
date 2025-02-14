package operadores_aritmeticos;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite a temperatura em celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.printf("A temperatura %.2f°C em Fahrenheit é %.2f°F%n", celsius, fahrenheit);

        input.close();
    }
}
