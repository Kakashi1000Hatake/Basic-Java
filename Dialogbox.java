import javax.swing.JOptionPane;
public class Dialogbox {
    public static void main(String args[]) {
        String name = JOptionPane.showInputDialog("Enter Your Name");
        JOptionPane.showMessageDialog(null, "Hello "+name);
    }
}
