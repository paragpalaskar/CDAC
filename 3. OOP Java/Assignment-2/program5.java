
import java.util.*;

class program5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);    

        int a = 10;
        int b = 20;

        System.out.println("the Number before swapping: ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Number after Swapping;-");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}