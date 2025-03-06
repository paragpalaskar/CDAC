
import java.util.Scanner;

class program18
{
    public static void main(String[] args) 
        {
            Scanner sobj = new Scanner(System.in);

            int iNo = 0, iCount = 0;
            
            System.out.println("Enter the Number : ");
            iNo = sobj.nextInt();

            String result = ( iNo >= 40)? "Pass" :" Fail";
            System.out.println("The Result is : "+ result);
           
        }
    
}