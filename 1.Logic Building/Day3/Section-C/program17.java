/*

17. Write a program to print the following pattern: 
    
***** 
 **** 
  *** 
   ** 
    * 

 */
class program17
{
    public static void main(String[] args) 
    {
        int n = 5;  // Number of rows

        for (int i = 0; i < n; i++) 
        {
            // Print leading spaces
            for (int j = 0; j < i; j++) 
            {
                System.out.print(" ");
            }

            // Print stars
            for (int j = i; j < n; j++) 
            {
                System.out.print("*");
            }
            System.out.println(); // <-- Correct placement for newline character
        }
    }
}
