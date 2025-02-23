// 19.  Write a Java program that calculate the power of that number as input : the base and the exponent and compute 
//      the result of base raised to the power of exponent

import java.util.*;

class program19
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner( System.in);

       
        int iValue1 = 0, iValue2 = 0, iCnt = 0, iResult = 1;

        System.out.println("Enter the Base Number :- ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the Exponent Number :-");
        iValue2 = sobj.nextInt();

        for( iCnt = 1; iCnt <= iValue2; iCnt++)
        {
            iResult = iResult * iValue1;
        }
        System.out.println(iValue1+ "raised to the power "+iValue2+" is : "+ iResult);

       
    }
}