/*
 
15. Write a program to print the following pattern: 

   * 
  *** 
 *****
*******
*********


 */


 class program15
 {
    public static void main(String[] args) 
    {
        int i = 0, j = 0;
        
        for( i = 1; i <= 5; i++)
        {
            for( j = 1; j <= 5 - i - 1; j++)
            {  
                System.out.print("");
            }
            System.out.println();
        }

        for( j = 1; j <= i * 2 - 1; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
 }