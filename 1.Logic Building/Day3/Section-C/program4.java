//  4.  Write a program to reverse the digits of the number 1234. The output should be 4321.

class program4
{
    public static void main(String[] args)
    {
       int iDigit = 0, iNo = 1234;

       while ( iNo > 0)
       {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
       }

    }
}