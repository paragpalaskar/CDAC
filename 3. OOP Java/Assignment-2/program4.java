import java.util.*;

class program4
{
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter the Number: ");
        iNo = sobj.nextInt();

       while(iNo >= 3)
       {
            iNo = iNo - 3;
       }

       if( iNo == 0)
       {
        System.out.println("the Number  is Divisible by 3.");
       }
       else
       {
        System.out.println("the Number  is not Divisible by 3.");
       }
    }
}

//  System.out.println("the Number "+iNo+" is Divisible by 3.");