
import java.util.Scanner;

// 9.   Write a program tha calculate the area of Circle

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