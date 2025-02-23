/*
 
21. Write a program to print the following pattern: 
1 
1*3 
1*3*5 
1*3*5*7 
1*3*5*7*9

 */

 class program21
 {
    public static void main(String[] args) 
    {
        int i = 0, j = 0, sum = 0;

        for( i = 1; i <= 5; i++)
        {
            int k = 1;

            for( j = 1 ; j <= i ; j++)
            {  
                System.out.print(k); 

                if( j < i )
                System.out.print( " * ");
                k = k + 2;
            }
            System.out.println();
        }
    }
 }

