// 5.   Write a Java Program that calculate the area of a Square using the formula
//      Area = side * side;



import java.util.*;

class program5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue = 0, Area = 0;

        System.out.println("Enter the Area : ");
        iValue = sobj.nextInt();

        Area = iValue * iValue;

        System.out.println("Area of Square is : "+ Area);

        
    }
}