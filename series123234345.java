import java.util.Scanner;
class series123234345{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a=1;
        for(int i=0;i<=n;i++)
        {
            for(int j=a;j<=a+2;j++)
            {
                System.out.print(j+" ");
            }
        a++;
        }
    }
}