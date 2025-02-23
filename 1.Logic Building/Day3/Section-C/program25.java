/*
 
25. Write a program to print the following pattern:

1 
12 
123 
1234 
12345

 */


 class program25
 {
    public static void main(String[] args) 
    {
        int i = 0, j = 0;
        
        for( i = 1; i <= 5; i++)
        {
            for( j = 1; j <= 5; j++)
            {
                if( j <= i)
                System.out.print(j);
            }
            System.out.println();
        }
    }
 }