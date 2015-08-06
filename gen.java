/**
 * Created by jhalaac on 06/08/15.
 */
public class gen {
    public void generate(int a)
    {
        for(int i=2;i<(a/2);i++)
        {
            if(issprime(i))
            {
                if(a%i==0)
                System.out.print(i+" " );
        }
    }
}
public boolean issprime(int i)
{
    for(int j=2;j<(i/2);j++)
    {
        if(i%j==0)
            return false;

    }

    return true;
}
}
