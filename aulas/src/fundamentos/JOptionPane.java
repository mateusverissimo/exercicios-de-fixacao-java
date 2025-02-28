package fundamentos;

public class JOptionPane {
    public static void main(String[] args) {
        String nome = javax.swing.JOptionPane.showInputDialog("Digite seu nome:");
        javax.swing.JOptionPane.showMessageDialog(null, "Bom dia " + nome + "!");
            }
}
