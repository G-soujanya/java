class OffTwoPyramids 
{
    public static void main(String args[])
    {
        for(int i=0;i<10;i++)
        {
            if(i<=5)
            {
            for(int j=0;j<i+1;j++)
            {
                System.out.print("*");
            }
            }
            else 
            {
                for(int j=0;j<10-i;j++)
                {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }    
}
