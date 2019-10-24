import java.util.Random;
import java.util.Scanner;


public class PrimenumberEx {
    public static void main(String args[]) {
        Scanner keybd = new Scanner(System.in);

        System.out.println("Enter Mynumber");
        int Mynumber;
        Mynumber = keybd.nextInt();

        int start = 1;
        int end;

        if (Mynumber % 2 == 0) ;
        {
            System.out.println("the number is not a prime number.");
        }

        if (Mynumber % 3 == 0) ;

        {
            System.out.println("the number is not a prime number.");
        }
        if (Mynumber % 5 == 0) ;
        {
            System.out.println("the number is not a prime number.");
        }

        while (Mynumber % 2 != 0 || Mynumber % 3 != 0 || Mynumber % 5 != 0) {

        }
        System.out.println("the number is a prime number");


        Random r = new Random();
        int Randomnumber = 1 + r.nextInt(250);
        System.out.println("My random number is " + Randomnumber);


        if (Randomnumber % 2 == 0) ;
        {
            System.out.println("the number is not a prime number.");
        }

        if (Randomnumber % 3 == 0) ;
        {
            System.out.println("the number is not a prime number.");
        }
        if (Randomnumber % 5 == 0) ;
        {
            System.out.println("the number is not a prime number.");
        }

        while (Randomnumber % 2 != 0 || Randomnumber % 3 != 0 || Randomnumber % 5 != 0) {

        }
        System.out.println("the number is a prime number");

    }
}




