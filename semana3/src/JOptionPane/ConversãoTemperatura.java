package JOptionPane;

import javax.swing.*;

public class ConversãoTemperatura {
    public static void main(String[] args) {

        String temp = JOptionPane.showInputDialog("Digite uma temperatura em graus Celsius: ");
        Integer celsius = Integer.parseInt(temp);

        int fahr = (celsius * 9/5) + 32;

        JOptionPane.showMessageDialog(null, celsius + "°C em graus Fahrenheit é " + fahr + " °F");
    }
}
