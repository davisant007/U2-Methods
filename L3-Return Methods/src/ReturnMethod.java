import javax.swing.*;

public class ReturnMethod {

    public static void main(String[] args) {

        double length = double.parseDouble(JOptionPane.showInputDialog("What is the length"));
        double width = double.parseDouble(JOptionPane.showInputDialog("What is the width"));

        //one way to use return methods
        double area = area(length,width);
        JOptionPane.showMessageDialog(null, "the area is: " + area + "n\The preimeter is" + perimeter + (length , width));
    }

    public static double area(double  length , double width){
        //double area = length * width
        //return area

        return length * width;

    }
        public static double perimeter(double length , double width){

        return 2 * (length + width);

        //2 * length + 2* width
        //length + length + width + width

        }

}
