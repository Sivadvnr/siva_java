class Table
{
    public static void main(String[] args)
    {
        int n = 15;
        int result = 0;

        for(int i=1; i<=10; i++)
        {
            result += (n*i);
            System.out.println(n + " X " + i + " = " + result);
        }
    }
}