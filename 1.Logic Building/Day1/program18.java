// 18.  Write a Java program to convert Celcius to

import java.util.*;

class program18
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner( System.in);

        float Farenheit = 0.0f;
        int fValue = 0;

        System.out.println("Enter the temprature in Celcius :- ");
        fValue = sobj.nextInt();

        Farenheit = (float) (( fValue * 1.8) + 32);

        System.out.println("The Temprature " + fValue + "C  is Equal to : " + Farenheit+ "F");
    }
}