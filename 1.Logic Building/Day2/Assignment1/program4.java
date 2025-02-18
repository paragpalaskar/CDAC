// 4. Write a Java program that display a " Good Morning" message if the time is between 5 am and 12 am.

import java.util.*;

class program4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue = 0;

        System.out.println("Enter the Time : ");
        iValue = sobj.nextInt();

        if( iValue > 5  && iValue < 12)
        {
            System.out.println("Good Morning...");
        }
        else
        {
            System.out.println("Good Evening...");
        }
    }
}