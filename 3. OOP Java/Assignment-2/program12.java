
import java.util.Scanner;

class program12
{
    public static void main(String[] args) 
        {
            Scanner sobj = new Scanner(System.in);

            int iNo = 0;
            
            System.out.println("Enter the Number : ");
            iNo = sobj.nextInt();

            int iResult = iNo << 3;

            System.out.println("The Result of is "+iNo+" * 8 : "+ iResult);
        }
    
}