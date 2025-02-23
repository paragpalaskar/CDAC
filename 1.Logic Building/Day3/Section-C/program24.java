/*
 
24. Write a program to print the following pattern:

1 
22 
333 
4444 
55555

 */


 class program24
 {
    public static void main(String[] args) 
    {
        int i = 0, j = 0;
        
        for( i = 1; i <= 5; i++)
        {
            for( j = 1; j <= 5; j++)
            {
                if( j <= i)
                System.out.print(i);
            }
            System.out.println();
        }
    }
 }