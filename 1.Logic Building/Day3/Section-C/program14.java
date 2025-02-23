/*

14. Write a program to print the following pattern: 
* 
 ** 
 *** 
 ***** 
 ******* 
 ********* 

 */


 class program14
 {
    public static void main(String[] args) 
    {
        int i = 0, j = 0;
        
        for( i = 1; i <= 9; i++)
        {
            for( j = 1; j <= 9; j++)
            {  
               if( i >= j)
               {
                System.out.print("*\t");
               }    
            }
            System.out.println();
        }
    }
 }