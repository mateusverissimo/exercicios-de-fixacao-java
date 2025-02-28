package JOptionPane;

import javax.swing.*;

public class CalculadoraSimples {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        Integer int1 = Integer.parseInt(num1);
        String sinal = JOptionPane.showInputDialog("Qual vai ser o sinal de operação?");
        String num2 = JOptionPane.showInputDialog("Digite o segundo número:");
        Integer int2 = Integer.parseInt(num2);

        int result = 0;

        switch (sinal) {
            case "+":
                result = int1 + int2;
                break;
            case "-":
                result = int1 - int2;
                break;
            case "*":
                result = int1 * int2;
                break;
            case "/":
                if (int2 != 0) {
                    result = int1 / int2;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Isso não é um sinal de operação.");
                return;
        }

        JOptionPane.showMessageDialog(null, num1 + sinal + num2 + "=" + result);
    }
}
