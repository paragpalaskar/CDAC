// 5.   Write a Java Program that take two number as input and display the product of the tow numbers

import java.util.Scanner;

class program5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue1 = 0, iValue2 = 0, Ans = 0;

        System.out.println("Enter the First Number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the Second Number : ");
        iValue2 = sobj.nextInt();

        Ans = iValue1 * iValue2;

        System.out.println("Product the 2 Number is : "+ Ans);


    }
}