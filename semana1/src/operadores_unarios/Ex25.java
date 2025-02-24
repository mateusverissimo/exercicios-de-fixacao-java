package operadores_unarios;

public class Ex25 {
    public static void main(String[] args) {
        int x = 10;

        System.out.println(++x); // x = 11, então imprime 11
        System.out.println(--x); // x = 10, então imprime 10
        System.out.println(x++); // Imprime 10, depois x se torna 11
        System.out.println(x--); // Imprime 11, depois x se torna 10
    }
}