// 3.   Write a Java Program that check whether the number is Even or Odd. Use an if else statement 
//      and the modulud operator to determine whether the number is divisible by 2 or not.

import java.util.*;

class program3
{
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();


        if( iValue % 2 == 0)
        {
            System.out.println("The Number "+iValue+" is Even");
        }
        else
        {
           
            System.out.println("The Number "+iValue+" is Odd");
        }

    }
}