public class calculator {
    public static void add(int a, int b, int c) {
        //int add = a +b+ c;
        System.out.println("Add of " + a + "," + b + "," + c + ", = " + (a + b + c));

    }

    public static void sub(int a, int b, int c) {
        //int sub = a-b-c;
        System.out.println("Sub of " + a + ", " + b + ", " + c + ", = " + (a - b - c));
    }

    public static void multiplication(int a, int b, int c) {
        //int multiplication =a*b*c;
        System.out.println("multiplication of " + a + ", " + b + "," + c + ", =" + (a * b * c));
    }

    public static void division(int a, int b, int c) {
        //int division = a/b/c
        System.out.println("division of " + a + "," + b + "," + c + ",=" + (a / b / c));

    }

    public static void num(int a, int b, int c)
    {
        System.out.println("num of " + a * a + "," + b * b + "," + c * c + ",=" + ("a * ab * bc * c"));

    }

    public static void c1 (int a,int b, int c)
    {
      System.out.println("c1 of "+a*a*a+","+b*b*b+","+c*c*c+", ="+ ("a*a*ab*b*b c*c*c"));
   }

    public static void m1(int a, int b){
     System.out.println("m1 of"+a+", "+b+",="+(a % b));
    }

    public static void main (String args[]){
        add(2, 4, 6);
        sub(8,5,3);
        multiplication (4,6,2);
        division (36,6,4);
        num (5,7,3);
        c1(3,5,8);
        m1 (313,3 );
    }










}
