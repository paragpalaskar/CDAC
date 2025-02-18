// 1.   Write a Java program that check if a number is positive using an if- else statement and print  
//      the appropriate message


import java.util.*;

class program1
{
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();


        if( iValue > 0)
        {
            System.out.println("The Number "+iValue+" is Postive");
        }
        else
        {
            System.out.println("The Number "+iValue+" is Negative");
        }

    }
}