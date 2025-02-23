
// 13.   Write a program and calculate the area of Circle.

import java.util.*;  

class program13
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner( System.in);
        int iValue1 = 0, iValue2 = 0, iValue3 = 0, iAns = 0;

        System.out.println("Enter the 1st Number :- ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the 2nd Number :- ");
        iValue2 = sobj.nextInt();

        System.out.println("Enter the 3rd Number :- ");
        iValue3 = sobj.nextInt();

       iAns = iValue1 + iValue2 + iValue3;

       iAns = iAns / 3;

       System.out.println("Average of the given Number is : "+ iAns);

    }
}