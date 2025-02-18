/*

1.  Write a program to classify student grades based on the following criteria: 
     If the score is greater than or equal to 90, print "A" 
     If the score is between 80 and 89, print "B" 
     If the score is between 70 and 79, print "C" 
     If the score is between 60 and 69, print "D" 
     If the score is less than 60, print "F"

 */



import java.util.*;
class program1
{
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        int a = 0;

        System.out.println("Enter Your Marks : ");
        a = sobj.nextInt();

        if( a >= 90)
        {
            System.out.println("A");
        }
        else if( a <= 89 && a >= 80)
        {
            System.out.println("B");
        }
        else if(a >= 70 && a <= 79)
        {
            System.out.println("C");
        }
        else if( a >= 60 && a <= 69)
        {
            System.out.println("D");
        }
        else if( a <= 60 )
        {
            System.out.println("F");
        }
    }
}