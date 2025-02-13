package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        double a = 1; // implícita
        System.out.println(a);

        float b = (float) 1.345634436463; // explicita (CAST)
        System.out.println(b);

        int c = 130;
        byte d = (byte) c;
        System.out.println(d);
    }
}
