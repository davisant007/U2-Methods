import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quotes {

    /*Create a GUI program with three buttons.
    Each button displays one of your favorite quotes.
    Hint: Use \n to make a new line.
     */
    public static void main(String[] args) {

        JFrame window = new JFrame("Three quotes");
        JPanel panel = new JPanel();

        JButton button1 = new JButton("my faaav quote");
        JButton button2 = new JButton("2nd fav quote");
        JButton button3 = new JButton("3rd fav quote");

        window.setSize(500,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        button1.addActionListener(new ButtonListener1());
        button2.addActionListener(new ButtonListener2());
        button3.addActionListener(new ButtonListener3());

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        window.add(panel);
        window.setVisible(true);



    }
    private static class ButtonListener1 implements ActionListener{


        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "\"This is my fav quote\"\n-Me");
        }
    }


private static class ButtonListener2 implements ActionListener{


    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null, "\"This is my fav quote\"\n-Me");
}

}

private static class ButtonListener3 implements ActionListener{


    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "\"This is my fav quote\"\n-Me");
    }
}

}
