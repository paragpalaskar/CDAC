
import java.util.Scanner;

class program15
{
    public static void main(String[] args) 
        {
            Scanner sobj = new Scanner(System.in);

            int iNo = 0, iCount = 0;
            
            System.out.println("Enter the Number : ");
            iNo = sobj.nextInt();

            int Even = 0xAAAAAAAA;
            int Odd = 0x55555555;

            int Swapp = ((iNo & Even) >> 1) | ((iNo & Odd) << 1);

            System.out.println("Result after swapping Even and Odd bit is : "+ Swapp);

           
        }
    
}