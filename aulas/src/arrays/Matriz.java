package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantos alunos? ");
        int qtdeAlunos = input.nextInt();

        System.out.print("Quantos notas por aluno? ");
        int qtdeNotas = input.nextInt();

        double[][] notasDaTurma =  new double[qtdeAlunos][qtdeNotas];

        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length; n++) {
                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
                notasDaTurma[a][n] = input.nextDouble();
                total += notasDaTurma[a][n];
            }
        }

        double media = total / (qtdeAlunos * qtdeNotas);
        System.out.println("Média da turma é " + media);

        input.close();
    }
}
