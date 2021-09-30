import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleInput {

    static int clickerCount=0;
   static JLabel clickerCountLabel;

    public static void main(String[] args) {
        JFrame window = new JFrame("clicker game");
        JPanel panel = new JPanel();
        clickerCountLabel = new JLabel("Balance : $");
        JButton clicker = new JButton("Click for $1");

        window.setSize(250,200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        panel.add(clickerCountLabel);
        panel.add(clicker);
        window.add(panel);

        window.setVisible(true);
    }
private static class ClickerListener implements ActionListener{

    public void actionPerformed(ActionEvent actionEvent) {

    }
}








}
