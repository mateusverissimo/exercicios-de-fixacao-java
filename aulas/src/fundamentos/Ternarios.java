package fundamentos;

public class Ternarios {
    public static void main(String[] args) {

        double media = 2.6;
        String resultadoParcial = media >= 5.0 ?
                "de recuperação." : "reprovado.";

        String resultadoFinal = media >= 7.0 ?
                "aprovado" : resultadoParcial;

        System.out.println("O aluno está " + resultadoFinal);

        double nota = 9.9;
        boolean bomComportamento = false;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto ? "Sim." : "Não.";

        System.out.printf("Tem desconto? %s", resultado);
    }
}
