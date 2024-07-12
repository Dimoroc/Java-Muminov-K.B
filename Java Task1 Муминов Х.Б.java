import java.util.Scanner;


class Task1 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();

        if(a < b)
            System.out.println(" a < b \n");
        if(a > b)
            System.out.println("a > b \n");
        if(a == b)
            System.out.println("a = b \n");

        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;

        System.out.println("a + b = " + c);
        System.out.println("a - b = " + d);
        System.out.println("a * b = " + e);
        System.out.println("a / b = " + f + "\n");
        
    }
}