/* 
 
    4.  Write a program to calculate the discount based on the total purchase amount. Use the following 
    criteria: 
     If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
     If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
     If the total purchase is less than Rs.500, apply a 5% discount. 
    Additionally, if the user has a membership card, increase the discount by 5%.

*/

import java.util.*;
class program4
{
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        int a = 0;

        System.out.println("Enter Your Purchase Amount : ");
        a = sobj.nextInt();

        if( a >= 900)
        {
            System.out.println("20% Discount applied...");
        }
        else if( a <= 999 && a >= 500)
        {
            System.out.println("10% Discount applied...");
        }
        else if( a <= 500 )
        {
            System.out.println("5% Discount applied...");
        }
    }
}