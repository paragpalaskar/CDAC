/*

    5.  Write a program that determines whether a student passes or fails based on their grades in three 
    subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or 
    more subjects, print the number of subjects they failed in.

 */

 import java.util.*;
class program5
{
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        int a = 0, b = 0, c = 0;

        System.out.println("Enter Your Marks in English : ");
        a = sobj.nextInt();

        System.out.println("Enter Your Marks in Hindi : ");
        b = sobj.nextInt();

        System.out.println("Enter Your Marks in Computer : ");
        c = sobj.nextInt();

        if(  (a < 40) )
        {
            System.out.println("Result : Failed the English Exam...");
        }
        else  if( (b < 40))
        {
            System.out.println("Rsult : Failed  the Hindi Exam....");
        }
        else if( c < 40)
        {
            System.out.println("Rsult : Failed  the Comupter Exam....");
        }
        else
        {
            System.out.println("Rsult : Passed all the Exam....");
        }
       
    }
}