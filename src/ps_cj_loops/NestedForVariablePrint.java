package ps_cj_loops;

public class NestedForVariablePrint
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
