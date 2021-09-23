import javax.swing.*;

public class CircleCalc {

    /*
    1. get the input - radius
    2. Calculate area
    3.calculate circumference
    4.display results - output

     */


    public static void main(String[] args) {

        double radius = getInput("what is the radius");
        //2
        double area = area(radius);
        //3
        double circumference = circumference(radius);
        //4
        JOptionPane.showMessageDialog(null, displayResult(area, circumference));
        //create and run the program

    public static double getInput(String prompt){
 return Double.parseDouble(JOptionPane.showInputDialog(prompt));
    }


//re-write the method to calculate a circle's area using parameters and return statement
    public static double area(double area){

        return Math.pow(radius, 2 ) * Math.PI;

    }

    //re-write the method to calculate a circle's perimeter using parameters and return statement
    public static double circumference(double radius){

    return 2 * Math.PI * radius;

}
public static String displayResult(double area,double circumference);

    String message = "The area is" + area;
    message += "\nThe circumference is:" + round.format(circumference);

    return message;

}