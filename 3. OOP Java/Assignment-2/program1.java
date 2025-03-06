class program1
{
    public static void main( String[] args)
    {
        int iNo1 = 10;
        int iNo2 = 11;

        System.out.println("Number before Swapping : ");
        System.out.println("No1 = "+iNo1);
        System.out.println("No2 = "+iNo2);

        iNo1 = iNo1 ^ iNo2;
        iNo2 = iNo1 ^ iNo2;
        iNo1 = iNo1 ^ iNo2;

        System.out.println("Number after Swapping : ");
        System.out.println("iNo1 = "+iNo1);
        System.out.println("iNo2 = "+iNo2);
        
    }
}