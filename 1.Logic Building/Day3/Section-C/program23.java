/*
 
23. Write a program to print the following pattern: 
11111 
22222 
33333 
44444 
55555 

 */

 class program23
 {
    public static void main(String[] args) 
    {
        int i = 0, j = 0;
        
        for( i = 1; i <= 5; i++)
        {
            for( j = 1; j <= 5; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
 }