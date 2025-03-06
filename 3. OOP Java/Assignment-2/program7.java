
import java.util.Scanner;

class program7
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        int a = 0;
        

        System.out.println("Ente the Year :");
        a = sobj.nextInt();

        if(( a % 4 == 0) && (( a % 100 != 0) || ( a % 400 == 0)))
        {
            System.out.println(a+" is a leap Year");
        }
        else
        {
            System.out.println(a+" is not a leap year");
        }
    }
}