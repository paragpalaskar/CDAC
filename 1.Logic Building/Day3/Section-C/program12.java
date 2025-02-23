/*
 
12. Write a program to draw the following pattern: 
***** 
***** 
***** 
***** 
***** 

 */

 class program12
 {
    public static void main(String[] args) 
    {
        int i = 0, j = 0;
        
        for( i = 1; i <= 5; i++)
        {
            for( j = 1; j <= 4; j++)
            {
                System.out.print("*\t");
            }

            System.out.println("\t");
        }
    }
 }