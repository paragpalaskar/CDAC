/*
 
19. Write a program to print the following pattern: 
1 
1*2 
1*2*3 
1*2*3*4 
1*2*3*4*5


 */

class program19
 {
    public static void main(String[] args) 
    {
        int i = 0, j = 0;

        for( i = 1; i <= 5; i++)
        {
            for( j = 1; j <= 5; j++)
            {
                if( j <= i)
                System.out.print(j+ "*");
            }
            System.out.println();
        }


    }
 }

 /*
  
1*
1*2*
1*2*3*
1*2*3*4*
1*2*3*4*5*

  */