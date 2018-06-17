import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        int a,b,c,d,e;
        double average;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number");
        a =sc.nextInt();
        System .out.println("Enter second number");
        b = sc.nextInt();
        System.out.println("Enter third number");
        c = sc.nextInt();
        System.out.println ("Enter fourth number");
        d = sc.nextInt();
        System.out.println("Enter fifth number");
        e = sc.nextInt();

        average = (a+b+c+d+e)/ 5 ;
        System.out.println("Average is " + average);




    }
}
