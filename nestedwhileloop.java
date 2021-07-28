public class nestedwhileloop
{
    public static void main (String[]args)
    {
        int sum = 0;
        int i = 0;
        int j = 0;

        while (i <= 6)
        {
            sum = sum + i;
            while (j <= 4)
            {
                sum = sum + j;
                j = j+1;
            }
            i = i+1;
        }
        System.out.println(sum);
    return;
    }}
