
// 15.   Write a program and print factorial of given Number 

import java.util.*;  

class program15
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner( System.in);
        int iCnt = 0, iNo = 0;
        System.out.println("Enter the  Number :- ");
        iNo = sobj.nextInt();
        System.out.println("Factorial of the Number is :- ");
        for( iCnt = 1; iCnt <= iNo; iCnt++)
        {
           if( iNo % iCnt == 0)
           {
                System.out.print(iCnt+ "\t");
           }
        }

        



    }
}