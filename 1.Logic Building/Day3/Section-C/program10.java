//  10. Write a program to print all even numbers between 1 and 50. 


class program10
{
    public static void main(String[] args)
    {
       int iCnt = 0, iCount = 0;
        System.out.println("Even Number are : ");
       for( iCnt = 1; iCnt <= 50; iCnt++)
       {
            if( iCnt % 2 == 0)
            {
                System.out.print(iCnt+"\t");
                iCount++;
            }
       }

    }
}