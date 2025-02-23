
import java.util.Scanner;

// 9.   Write a program tha calculate the area of Circle

class program9
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner( System.in);
        
        float fValue = 0.0f, fArea = 0.0f;

        System.out.println("Enter the Area of Circle :-");
        fValue = sobj.nextFloat();

        fArea = (float)3.14 * fValue * fValue;

        System.out.println("Area of Circle is : "+fArea);


    }
}