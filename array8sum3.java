import java.util.Scanner;
class array8sum3{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int sum =0;
        for (int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        for(int i=0;i<3;i++)
        {
            sum +=arr[i];
        }
            System.out.print(sum);
    }
}