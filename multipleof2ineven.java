import java.util.Scanner;
class multipleof2ineven{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int r =sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.print(a+" ");
            a*=r;
        }
    }
}