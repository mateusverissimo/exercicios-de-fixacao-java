package operadores_atribuicao;

public class Ex23 {
    public static void main(String[] args) {

        int saldo = 500;
        System.out.println(saldo); // valor 500

        saldo += saldo; // adicionou 500 + 500

        System.out.println(saldo); // valor mudou para 1000

        saldo += saldo; // adicionou 1000 + 1000
        System.out.println(saldo); // valor mudou para 2000

        saldo += saldo; // adicionou 2000 + 2000
        System.out.println(saldo); // valor mudou para 4000
    }
}
