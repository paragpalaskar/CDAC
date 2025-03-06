
import java.util.Scanner;

class program14
{
    public static void main(String[] args) 
        {
            Scanner sobj = new Scanner(System.in);

            int iNo = 0, iCount = 0;
            
            System.out.println("Enter the Number : ");
            iNo = sobj.nextInt();

            while( iNo > 0)
            {
                iNo = iNo & ( iNo - 1);
                iCount++;
            }

            System.out.println("The No. of 1s in binary representation is : "+ iCount);

           
        }
    
}