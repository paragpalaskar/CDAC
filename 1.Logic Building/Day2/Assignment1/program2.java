// 2.   Write a Java program and check if a predefined number is negative using an if - else statement and display the 
//      result.

import java.util.*;

class program2
{
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();


        if( iValue < 0)
        {
            System.out.println("The Number "+iValue+" is Negative");
        }
        else
        {
           
            System.out.println("The Number "+iValue+" is Postive");
        }

    }
}