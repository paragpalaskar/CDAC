/*

13. Write a program to print the following pattern: 

1 
2*2 
3*3*3 
4*4*4*4 
5*5*5*5*5 
5*5*5*5*5 
4*4*4*4 
3*3*3 
2*2

 */

 class program13
 {
    public static void main(String[] args) 
    {
        int i = 0, j = 0;
        
        for( i = 1; i <= 5; i++)
        {
            for( j = 1; j <= i; j++)
            {
                System.out.print(i);

                if( j < i)
                {
                    System.out.print("*\t");
                }
                
            }

            System.out.println("\t");
        }

        for( i = 5; i >= 1; i--)
        {
            for( j = 1; j <= i; j++)
            {
                System.out.print(i);

               if( j < i)
               {
                System.out.print("*\t");
               }
            }

            System.out.println("\t");
        }
    }
 }