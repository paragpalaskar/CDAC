// 5.   Write a program to print the Fibonacci sequence up to the number 21.

class program5
{
    public static void main(String[] args)
    {
       int a = 0, b = 1, c;

       System.out.println( a + " "+ b);

       c = a + b;
       while( c <= 21)
       {
            System.out.print(" " + c);
            a = b; 
            b = c;
            c = a + b;
       }

    }
}