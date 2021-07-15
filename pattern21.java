package for_loop;


public class pattern21
{
    void main()
    {
        int n=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j<=5;j++)
            {
                System.out.print(n+"\t");
                n++;
            }
            System.out.println();
        }
    }
}