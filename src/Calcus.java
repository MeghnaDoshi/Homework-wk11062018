import java.util.Scanner;
public class Calcus {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter int c " );
         int c =sc.nextInt();
         System.out.println("Enter int d");
         int d =sc.nextInt();

         int add = c + d;
         int sub = c - d;
         int multiply = c * d;
         int division = c/ d;
         int square = c*c;
         int cube = c*c*c;
         int modulus = c % d;

         System.out.println("Add  "+c+","+d+" =" +  (c + d));
         System.out.println("Subtraction  "+c+", "+d+" =" +  (c - d));
         System.out.println("Multiply  "+c+", "+d+", =" + (c* d));
         System.out.println("Divide "+c+" ,"+d+" =" + (c/d));
         System.out.println("Sqaure "+c*c+"  ="+ (c*c));
         System.out.println ("Cube "+c*c*c+" =" + (c*c*c));
         System.out.println("Modulus "+c+" , "+d+",=" + (c % d));



    }

    }


