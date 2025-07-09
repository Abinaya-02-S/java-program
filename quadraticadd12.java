import java.util.Scanner;
class quadraticadd12{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        for(int i=0;i<n;i++)
        {
          a+=i;
          System.out.print(a+" ");
        }
    }
}