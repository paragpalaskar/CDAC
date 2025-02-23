//  2.  Write a program to compute the factorial of the number 10.

class program2
{
    public static void main(String[] args)
    {
       int iNo = 10, iCnt = 0;
       int Factorial = 1;

        for( iCnt = 1; iCnt <= iNo; iCnt++)
        {
            Factorial = Factorial * iCnt;
        }

        System.out.println("Factorial of 10 is : "+ Factorial);

    }
}