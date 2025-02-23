
import java.util.Scanner;

/*
 
    11. Write a Java program that takes three numbers as input and finds the largest of the three. 
        Test Data: 
         Input first number: 12 
         Input second number: 45 
         Input third number: 22 
        Expected Output: 
        The largest number is 45.

 */

class program11
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner( System.in);
        int iValue1 = 0, iValue2 = 0, iValue3 = 0;

        System.out.println("Enter the 1st Number :- ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the 2nd Number :- ");
        iValue2 = sobj.nextInt();

        System.out.println("Enter the 3rd Number :- ");
        iValue3 = sobj.nextInt();

       if( iValue1 > iValue2)
       {
            System.out.println("the Largest Number is : "+ iValue1);
       }
       else if( iValue2 > iValue3)
       {
        System.out.println("the Largest Number is : "+ iValue2);
       }
       else
       {
        System.out.println("the Largest Number is : "+ iValue3);
       }


    }
}