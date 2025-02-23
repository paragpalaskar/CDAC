//  7.  Write a program to calculate the sum of the digits of the number 9876. The output should be 
//      30 (9 + 8 + 7 + 6). 

class program7
{
    public static void main(String[] args)
    {
       int iDigit = 0, iNo = 9876, iSum = 0;

       while ( iNo > 0)
       {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
       }
       System.out.println("Addition is : "+ iSum);

    }
}