package estruturas_condicionais;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bom dia usuário! Qual sua idade? ");
        int idade = input.nextInt();

        System.out.println("Entendi! Você é estudante? [S/N]: ");
        String aluno = input.next();

        if (idade > 18 && aluno.equalsIgnoreCase("S")){
            System.out.println("Você tem direito a desconto!");
        } else {
            System.out.println("Desconto não disponível para suas condições.");
        }
    }
}
