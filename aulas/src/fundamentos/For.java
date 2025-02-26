package fundamentos;

public class For {
    public static void main(String[] args) {
//        int contador = 0;

//        while (contador <= 20) {
//            System.out.printf("i = %d\n", contador);
//            contador += 2;
//        }

        for (int contador = 0; contador <= 20; contador ++) {
            System.out.printf("i = %d\n", contador);
        }

        int x = 2;
        for(; x < 10;) {
            System.out.println("x = " + x);
            x++;
        }

        for(;;) {

        }
    }
}
