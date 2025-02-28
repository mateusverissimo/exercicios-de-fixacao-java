package JOptionPane;

import javax.swing.*;

public class MensagemBoasVindas {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        JOptionPane.showMessageDialog(null, "Bem vindo " + nome + "!");
    }
}
