
import java.util.Scanner;

/* 
 
    10. Write a Java program that takes three numbers as input and finds the largest of the three. 
        Test Data: 
         Input first number: 12 
         Input second number: 45 
         Input third number: 22
         
        Expected Output: 
        The largest number is 45.
  
 */

class program10
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner( System.in);
        int iValue = 0;

        System.out.println("Enter the Number :- ");
        iValue = sobj.nextInt();

        if( iValue % 2 == 0)
        {
            System.err.println("The Number " + iValue +" is Even");
        }
        else
        {
            System.err.println("The Number " + iValue +" is Odd");
        }


    }
}