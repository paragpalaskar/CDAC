/*
 
    8.  Write a Java program to swap the values of two variables without using a 
        third variable. 

    Test Data: 
     Input first number: 10 
     Input second number: 20 

    Expected Output: 

    Before swapping: 
    First number: 10 
    Second number: 20

    After swapping: 
    First number: 20 
    Second number: 10

 */


 class program8
{
    public static void main(String Args[])
    {

        int x = 10; 
        int y = 20;

        System.out.println("The Value before Swapping a = "+ x +" and and b = "+ y +" .");

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("The Values after Swapping for a = "+ x +" and b = "+ y +" .");
    }
}