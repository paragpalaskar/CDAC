


/*

    2.  Write a program that uses a nested switch statement to print out the day of the week based on an 
    integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it 
    is a weekday or weekend. 

 */

 import java.util.*;

 class program2
 {
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue = 0;

        System.out.println("Enter the Number of Weekend from 1 to 7 : ");
        iValue = sobj.nextInt();

        switch( iValue)
        {
            case 1 : System.out.println("Monday (Its weekday)");
            break;

            case 2 : System.out.println("Tuesday (Its weekday)");
            break;

            case 3 : System.out.println("Wednesday (Its weekday)");
            break;

            case 4 : System.out.println("Thrusday (Its weekday)");
            break;

            case 5 : System.out.println("Friday (Its weekday)");
            break;

            case 6 : System.out.println("Saturday (Its weekday)");
            break;

            case 7 : System.out.println("Sunday (Its weekend)");
            break;

            default: System.out.println("Error : Invalid input, try again ");
        }

        
    }
 }