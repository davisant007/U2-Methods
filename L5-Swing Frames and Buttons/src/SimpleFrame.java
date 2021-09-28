import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleFrame

{

    public static void main(String[] args)

    {

        JFrame window = new JFrame("This is a simple window");
        JPanel panel = new JPanel();
        JButton button = new JButton("Click for a dollar");


        window.setSize(300,100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        button.addActionListener(new ButtonListener());




        panel.add(button);
        window.add(panel);

        window.setVisible(true);




    }

    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "You got $1");

        }
    }



}
