//  1.  Write a program to calculate the sum of the first 50 natural numbers. 

class program1
{
    public static void main(String[] args)
    {
        int a = 50, i = 0, iSum = 0;

        for( i = 1; i <= a; i++ )
        {
            iSum = iSum + i;
        }

        System.out.println("Addition of Natural Number is : "+ iSum);
    }
}