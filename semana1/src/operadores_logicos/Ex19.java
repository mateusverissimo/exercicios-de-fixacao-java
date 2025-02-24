package operadores_logicos;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = input.nextDouble();

        boolean aprovado = (nota >= 6);
        System.out.println("Aprovado: " + aprovado);

        input.close();
    }
}