import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {

    //Declare your frame, panel and three buttons.
    public ColorSwitchGUI(){
        //create your GUI
        JFrame window = new JFrame("color switcheroo");
        JPanel panel new JPanel();
        JButton buttonThemeDark = new JButton("theme:dark");
        JButton buttonThemeWarren = new JButton("Theme:warren");
        JButton buttonThemePrimary == new JButton("Theme:Primary");

                public ColorSwitchGUI(){
            window.setSize(400,300);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setLocationRelativeTo(null);

            //




            panel.add(buttonThemeDark);
            panel.add(buttonThemePrimary);
            panel.add(buttonThemeWarren);

            window.add(panel);
            window.setVisible(true);

        }


    }

    //add listeners to change the colors. Don't forget to link them to buttons.
    private class ThemeDark implements ActionListener{


        public void actionPerformed(ActionEvent actionEvent){
            Color panelBack = new Color(38,28,44);
            Color buttonBack = new Color(62,44,65);
            Color buttonText =new Color(110,133);



            panel.setBackground(panelBack);





        }


    }
}
