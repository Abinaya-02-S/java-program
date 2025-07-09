import java.util.Scanner;
class integer10192{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(a+" "+b+" ");
            a--;
            b++;
        }
    }
}