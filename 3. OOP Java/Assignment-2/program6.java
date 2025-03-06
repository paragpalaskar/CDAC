
import java.util.*;

class program6
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);    

        int a = 0, b = 0, c = 0, largest = 0;
        
        System.out.println("Enter the 1st Number:");
        a = sobj.nextInt();
        System.out.println("Enter the 2st Number:");
        b = sobj.nextInt();
        System.out.println("Enter the 3st Number:");
        c = sobj.nextInt();

        largest = ( a > b) ? ((a > c) ? a : b) : ((b > c) ? b : c);

        System.out.println("The Largest Number is : "+ largest);

        
        



    }
}