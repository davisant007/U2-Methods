import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BasicCalculator {

    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */
        static JLabel basicCalculatorLabel;
        static JTextField textInputField;


   public static void main(String[] args) {


        JFrame window = new JFrame("Basic calculator");
        JPanel panel = new JPanel();
        JButton clicker = new JButton("solve");
        textInputField = new JTextField(10);


        window.setSize(150,100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);




        panel.add(clicker);
        window.add(panel);

        window.setVisible(true);







         }








}
