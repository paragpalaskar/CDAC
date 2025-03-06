import java.util.*;

class program8
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        boolean a = false, b = false, c = false;

        System.out.println("Enter the 1st Boolean: ");
        a = sobj.nextBoolean();

        System.out.println("Enter the 2nd Boolean : ");
        b = sobj.nextBoolean();

        System.out.println("Enter the 3rd Boolean : ");
        c = sobj.nextBoolean();

        if( (a && b) || ( a && c) || ( b && c))
        {
            System.out.println("Two input are True");
        }
        else
        {
            System.out.println("Two input are Not True");
        }

    }
}