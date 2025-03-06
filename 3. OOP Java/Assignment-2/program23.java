import java.util.Scanner;

class program23 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sobj.nextInt();

        String result = (number & 1) == 0 ? "The number is even." : "The number is odd.";

        System.out.println(result);
    }
}
