import java.util.Scanner;

class Task2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Word 1: ");
        String word1 = in.nextLine();
        System.out.print("Input Word 2: \n");
        String word2 = in.nextLine();

        if(word1.equals(word2))
            System.out.print("Строки идентичны");
        else
            System.out.print("Строки неидентичны");

    }
}
