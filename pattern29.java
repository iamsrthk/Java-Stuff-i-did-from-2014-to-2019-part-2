public class pattern29
{
    void main()
    {

        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=1;j--)
            {
                if(j%2!=0)
                {
                    System.out.print(0);
                }
                else
                {
                    System.out.print(1);    
                }

            }
            System.out.println();
        }
        
    }
}
