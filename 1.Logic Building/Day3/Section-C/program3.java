// 3.   Write a program to print all multiples of 7 between 1 and 100.

class program3
{
    public static void main(String[] args)
    {
       int iCnt = 0, iCount = 0;
        System.out.println("Multiple of 7 are : ");
       for( iCnt = 1; iCnt <= 100; iCnt++)
       {
            if( iCnt % 7 == 0)
            {
                System.out.print(iCnt+"\t");
                iCount++;
            }
       }

    }
}