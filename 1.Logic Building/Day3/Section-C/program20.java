/*
 
20. Write a program to print the following pattern: 
5 
5*4 
5*4*3 
5*4*3*2 
5*4*3*2*1 

 */

class program20
 {
    public static void main(String[] args) 
    {
        int i = 0, j = 0;

        for( i = 5; i>= 1; i--)
        {
            for( j = 5; j >= 1; j--)
            {
                if( j >= i)
                System.out.print(j+ "*");
            }
            System.out.println();
        }


    }
 }
