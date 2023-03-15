import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {

        Scanner ch = new Scanner(System.in);
        System.out.print("Enter an Alphabet:");
        char letter = ch.next().charAt(0);
        if (Character.isUpperCase(letter)) {
            System.out.println(letter +"->"+Character.toLowerCase(letter));

        }else if (Character.isLowerCase(letter)) {
            System.out.println(letter +"->" +Character.toUpperCase(letter));
        } else
            System.out.println("It is not an alphabet");
    }


}
