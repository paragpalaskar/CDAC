/*

18. Write a program to print the following pattern: 
    * 
   *** 
  ***** 
 ******* 
  ***** 
   *** 
    *


 */


 class program18
 {
    public static void main(String[] args) 
    {
        int i = 0, j = 0, n = 0;

        for ( i = 0; i < n; i++) 
        {
            for ( j = 0; j < n - i - 1; j++) 
            {
                System.out.print(" ");
            }
            for ( j = 0; j < 2 * i + 1; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for ( i = n - 2; i >= 0; i--) 
        {
            for ( j = 0; j < n - i - 1; j++) 
            {
                System.out.print(" ");
            }
            for ( j = 0; j < 2 * i + 1; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
 }