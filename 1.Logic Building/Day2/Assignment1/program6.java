// 5.   Write a Java Program that calculate the area of a Rectangle using the formula
//      Area = Length * Width



import java.util.*;

class program6
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        int Length = 0,Width = 0, Area = 0;

        System.out.println("Enter the Length of Rectangle : ");
        Length = sobj.nextInt();

        System.out.println("Enter the Width of Rectangle : ");
        Width = sobj.nextInt();

        Area = Length * Width;

        System.out.println("Area of Rectangle is : "+ Area);

        
    }
}