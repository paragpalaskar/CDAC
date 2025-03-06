
import java.util.Scanner;

class program11
{
    public static void main(String[] args) 
    {
            Scanner sobj = new Scanner(System.in);

            int a = 0;

            System.out.println("Enter a Number : ");
            a = sobj.nextInt();

            boolean bRet = ( a > 0) && ( a & (a - 1)) == 0;

            if( bRet)
            {
                System.out.println(a+" is a power of 2");
            }
            else
            {
                System.out.println(a+" is not a power of 2");
            }


    }
}