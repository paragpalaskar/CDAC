
// 7.   Write a Java program that takes a number as input and prints its multiplication table up to 
//      10


class program7
{
    public static void main(String[] args) 
    {
        int a = 8;
        int iCnt = 0;

        for( iCnt = 1; iCnt <= 10; iCnt++)
        {
            System.out.println("Expected Output is 8 * "+ iCnt +" = "+ iCnt * a);
        }

    }
}