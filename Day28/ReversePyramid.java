class ReversePyramid 
{
    public static void main(String args[])
    {
        for(int i=5;i>0;i--)
        {
            for(int j=0;j<5-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<5-i;j++)
            {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }    
}