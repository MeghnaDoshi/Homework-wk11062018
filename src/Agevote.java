import java.util.Scanner;

public class Agevote {
    public static void main(String[] args) {

        Scanner scan =new Scanner (System.in);
        int b =scan.nextInt();
        System.out.println("Enter the age");
        System.out.println("+Age of user is+ "+  b);
if (b >=18){
    System.out.println("Eligible to vote");
}
else{
    System.out.println("not Eligible to vote");
}
    }
}
