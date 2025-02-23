//  9. Write a program to find and print the largest digit in the number 4825. 

class program9
{
    public static void main(String[] args)
    {
       int iDigit = 0, iNo = 4825, iMax = 0;

       while ( iNo > 0)
       {
            iDigit = iNo % 10;

            if(iDigit > iMax)
            {
                iMax = iDigit;
            }

            iNo = iNo / 10;
       }
       System.out.println("Max Number in Digit is : "+ iMax);

    }
}