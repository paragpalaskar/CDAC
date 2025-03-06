
import java.util.Scanner;

class program16
{
    public static void main(String[] args) 
        {
            Scanner sobj = new Scanner(System.in);

            int iNo = 0, iCount = 0;
            
            System.out.println("Enter the Number : ");
            iNo = sobj.nextInt();

            String result = ( iNo % 2 == 0)? "Even" :" Odd";
            System.out.println("The Number is : "+ result);
           
        }
    
}