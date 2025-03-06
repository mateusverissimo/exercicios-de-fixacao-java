package JOptionPane;

import javax.swing.*;

public class ParOuImpar {
    public static void main(String[] args) {

        String n = JOptionPane.showInputDialog("Digite um número: ");
        Integer num = Integer.parseInt(n);

        if (num % 2 == 1) {
            JOptionPane.showMessageDialog(null, "Seu número é ímpar!");
        } else if (num == 0) {
            JOptionPane.showMessageDialog(null,"Seu número é zero!");
        } else {
            JOptionPane.showMessageDialog(null, "Seu número é par!");
        }
    }
}
