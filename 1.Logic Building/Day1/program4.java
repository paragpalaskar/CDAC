// 4.   Write a Java Program to print the result of the following operations

class program4
{
    public static void main(String[] args) 
    {
        int a = 5, b = 8, c = 6, Ans = 0;
        Ans =  b * c - a;

        int a1 = 55, b1 = 9, c1 = 9, Ans1 = 0;
        Ans1 = (a + b) % c;
        
        int a2 = 20, b2 = -3, c2 = 5, Ans2 = 0;
        Ans2 = a2 + b2 * c2 / 8;

        int a3 = 5, b3 = 3, c3 = 8, Ans3 = 0;
        Ans3 = a3 + 15 / b3 * 2 - c3 % 3; 



        Ans = a / b;

        System.out.println("Expected Output : "+Ans);
        System.out.println("Expected Output : "+Ans1);
        System.out.println("Expected Output : "+Ans2);
        System.out.println("Expected Output : "+Ans3);

    }
}