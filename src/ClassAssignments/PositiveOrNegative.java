package ClassAssignments;

import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args){

        int i;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        if (i == 0){
            System.out.println("Given number is zero");
        } else if (i > 0) {
            System.out.println("Given number is a Positive number");
            }
            else{
            System.out.println("Given number is a Negative Number");
        }
    }
}
