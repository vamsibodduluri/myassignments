package ClassAssignments;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if (a % 2 == 0){
            System.out.println(a + " is an even number");
        }
        else {
            System.out.println(a + " is an odd number");
        }
    }
}
