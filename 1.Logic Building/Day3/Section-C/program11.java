//  11. Write a Java program to demonstrate the use of both pre-increment and post-decrement 
//      operators in a single expression.


class program11
{
    public static void main(String[] Args)
    {
        int x = 5, y = 10, result = 0;

        result = ++x - y--;

        System.out.println("Value of x after expression: " + x);
        System.out.println("Value of y after expression: " + y);
        System.out.println("Result of the expression: " + result);


    }
}