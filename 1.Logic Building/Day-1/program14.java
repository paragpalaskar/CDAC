
// 14.  Write a Java program to print the Fibonacci series up to the 10th number.

import java.util.*;  

class program14
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner( System.in);

        int a = 0, b = 1, c , i= 0, n = 0;

        System.out.println("Fibonacci Series upto 10 ");
        
        for( i = 1; i <= 10; i++)
        {
            System.out.print(a+"\t");

            c = a + b;
            a = b;
            b = c;
        }
    }
}