import java.util.Locale;

public class StringExamples {

    public static void main(String[] args) {

        String greeting = "Hello";
        String name = "Hephaestus";

        //style 1
        int greetingSize = greeting.length();
        System.out.println(greeting + "Has" + greetingSize + "letters.");

        //style 2
        System.out.println(name + "has" + name.length() + "letters");

        //Create a program which capitalizes the first letter of any word

        /*
        1.Get the input - Users name
        2.isolate the first letter
        3.capitalize the first letter
        4.combine first lette with name hephaestus
        5.combine #2 + #4
        6.output
         */

        System.out.println(capitalizeFirst(name));


}
    }

public static String capitalizeFirst( String name){

    String firstLetter = name.substring(0,1);

    firstLetter = firstLetter.toUpperCase();

    String restOfName = name.substring(1);

    return firstLetter + restOfName

}

