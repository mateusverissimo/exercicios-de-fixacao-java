package JOptionPane;

import javax.swing.*;

public class CalculandoMedia {
    public static void main(String[] args) {
        String media1 = JOptionPane.showInputDialog("Digite a primeira nota: ");
        Integer num1 = Integer.parseInt(media1);
        String media2 = JOptionPane.showInputDialog("Digite a segunda nota: ");
        Integer num2 = Integer.parseInt(media2);
        String media3 = JOptionPane.showInputDialog("Digite a terceira nota: ");
        Integer num3 = Integer.parseInt(media3);

        int mediatotal = (num1 + num2 + num3) / 3;

        JOptionPane.showMessageDialog(null, "Sua média é: " + mediatotal);
    }
}
