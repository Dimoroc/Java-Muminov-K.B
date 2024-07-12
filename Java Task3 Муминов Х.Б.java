import java.util.Arrays;

class Main 
{
    public static void main(String[] args)
    {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.print("Чётные числа массива: ");

        for(int i = 0; i < array1.length; i++)
            if(array1[i] % 2 == 0)
                System.out.print(array1[i] + " ");

    }
}
