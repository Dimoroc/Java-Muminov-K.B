import java.util.Scanner;


class Task1 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        float a = in.nextInt();
        System.out.print("Input b: ");
        float b = in.nextInt();

        if(a < b)
            System.out.println(" a < b \n");
        if(a > b)
            System.out.println("a > b \n");
        if(a == b)
            System.out.println("a = b \n");

        float c = a + b;
        System.out.println("a + b = " + c);

        float d = a - b;
        System.out.println("a - b = " + d);

        float e = a * b;
        System.out.println("a * b = " + e);

        float f = 0;
        if(b != 0)
        {
            f = a / b;
            System.out.println("a / b = " + f + "\n");
        }
        else 
        {
            System.out.println("Сan't divide by zero \n");
        }
        
    }
}
