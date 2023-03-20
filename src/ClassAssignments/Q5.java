package ClassAssignments;

public class Q5 {

    public static void main(String[] args) {
        char input = '9';

        if ((input >= 65 && input <= 90)
                || (input >= 97 && input <= 122)){
            System.out.println("Given input is an Alphabet");
        }else if (input >= 48 && input <= 57){
            System.out.println("Given input is a Digit");
        }else
            System.out.println("Given input is a special character");
    }
}
