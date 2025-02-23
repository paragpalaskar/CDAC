
// 6.   Write a Java Program that take two number as input and display the sum, product, Difference, division of the two numbers

import java.util.Scanner;

class program6
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue1 = 0, iValue2 = 0, Ans1 = 0, Ans2 = 0,Ans3 = 0, Ans4 = 0, Ans5 = 0;

        System.out.println("Enter the First Number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the Second Number : ");
        iValue2 = sobj.nextInt();

        Ans1 = iValue1 + iValue2;
        Ans2 = iValue1 - iValue2;
        Ans3 = iValue1 * iValue2;
        Ans4 = iValue1 / iValue2;
        Ans5 = iValue1 % iValue2;

        System.out.println("Expected Result : "+ Ans1);
        System.out.println("Expected Result : "+ Ans2);
        System.out.println("Expected Result : "+ Ans3);
        System.out.println("Expected Result : "+ Ans4);
        System.out.println("Expected Result : "+ Ans5);


    }
}