import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
     */
 /*the plan:
    1.Get the input - a word with a p
    2.isolate the first p
    3.isolate 3 letters after p
    4.
  */

    public static void main(String[] args) {

     String word = JOptionPane.showInputDialog("Enter a word with a p");
        JOptionPane.showMessageDialog(null, spiltP(word));

    }

    public static String spiltP(String word){
        int pIndex = word.indexOf('p');

        return word.substring(pIndex , pIndex) + 4;







    }


}