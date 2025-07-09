import java.util.Scanner;
class triangular234{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);      
        int n = sc.nextInt();
        int sum = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum += i;           //n(n+1)2
            System.out.print(sum+" ");
            sum++;
        }
    }
}
