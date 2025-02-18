/* 
 
    3.  Write a program that acts as a simple calculator. It should accept two numbers and an operator 
    (+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested if
    else to check if division by zero is attempted and display an error message.

*/

 import java.util.*;

 class program3
 {
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        int a = 0, b = 0, Result = 0;
        char iValue3 = 0;

        System.out.println("Enter the 1st Number :- ");
       a = sobj.nextInt();

        System.out.println("Enter the 2nd Number :- ");
        b = sobj.nextInt();

        System.out.println("Enter Operator +, -, *, / :- ");
        iValue3 = sobj.next().charAt(0);

    

        switch( iValue3)
        {
            case '+' :   Result = a + b;
            break;

            case '-' :   Result = a - b;
            break;

            case '*' :   Result = a * b;
            break;

            case '/' : 
                        if( b != 0)
                        {
                            Result = a / b;
                        }
                        else
                        {
                            System.out.println("Error : Enter valid Input...");
                        }
                        
            break;


            default: System.out.println("Error : Invalid input, try again ");
        }

        System.out.println(" The Result is : "+ Result);
         
    }
 }