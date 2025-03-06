
import java.util.Scanner;

class program10
{
    public static void main(String[] args) 
    {
            Scanner sobj = new Scanner(System.in);

            char ch ='\0';
            boolean bRet = false;
            

            System.out.println("Enter the Character : ");
            ch = sobj.next().charAt(0);

            String Result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "Vowel" : "consonant";

            System.out.println("The Character "+ch+ " is a "+Result+". ");
    }
}