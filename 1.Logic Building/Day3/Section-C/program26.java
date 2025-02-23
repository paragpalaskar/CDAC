/*
 
26. Write a program to print the following pattern: 
 
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15

 */

 class program26
 {
    public static void main(String[] args) 
    {
        int i = 0, j = 0, k = 1;
        
        for( i = 1; i <= 5; i++)
        {
            for( j = 1; j <= 5; j++ )
            {
                if( j <= i)
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
 }