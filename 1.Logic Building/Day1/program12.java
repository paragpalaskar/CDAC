


/*
 
    12. Write a Java program that takes a number as input and prints the reverse of that number. 
        Test Data: 
         Input number: 12345 
        Expected Output: 
        The reverse of 12345 is 54321.

 */

 import java.util.*;
class program12
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner( System.in);
        int iNo = 0, iDigit = 0;

        System.out.println("Enter the Number :- ");
        iNo = sobj.nextInt();

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            System.out.print(iDigit+ " \t");
            iNo = iNo / 10;
        }


    }
}