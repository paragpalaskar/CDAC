
import java.util.Scanner;

class program9
{
    public static void main(String[] args) 
    {
          Scanner sobj = new Scanner(System.in);
          int a = 0;
          boolean bRet = false;

          System.out.println("Enter the Number :");
          a = sobj.nextInt();

          bRet = ((a > 20) && (a < 50));

          System.out.println(" The Number is Within Range...?  "+ bRet);
         



        
    }
}