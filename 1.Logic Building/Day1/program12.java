
import java.util.Scanner;

// 9.   Write a program tha calculate the area of Circle

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