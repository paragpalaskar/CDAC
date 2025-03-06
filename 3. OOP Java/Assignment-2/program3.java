class program3
{
    public static void main(String[] args) 
    {
        int iNo = 123456;
        int iDigit = 0, iSum = 0;

        while( iNo > 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;

        }

        System.out.println("Addition is: "+ iSum);

      
    }
}