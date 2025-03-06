import java.util.Scanner;

class program25 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int reverse = 0, number = 0;

        System.out.println("Enter a number: ");
        number = sobj.nextInt();

        while (number != 0) 
        {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }

        System.out.println("The reversed number is: " + reverse);
    }
}
