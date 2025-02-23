// 20.  Write a Java program and count the Digit of given Number 

import java.util.*;

class program20
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner( System.in);

       
        int iNo = 1, iDigit = 0, iCount = 0;

        System.out.println("Enter the Digit :- ");
        iNo = sobj.nextInt();

        while( iNo > 0)
        {
            iDigit = iNo % 10;
            iCount++;
            iNo = iNo / 10;
        }

        System.out.println(" The Number has "+ iCount+" digits.");

       
    }
}