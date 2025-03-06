
import java.util.Scanner;

class program13
{
    public static void main(String[] args) 
        {
            Scanner sobj = new Scanner(System.in);

            int iNo = 0;
            
            System.out.println("Enter the Number : ");
            iNo = sobj.nextInt();

           int imask = iNo >> 31;
           int abs = ( iNo + imask) ^ imask;

           System.out.println("The absolute Value of " +iNo+ " is : "+ abs);
        }
    
}