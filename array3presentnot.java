import java.util.Scanner;
class array3presentnot{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int [] arr={2,4,10,44,56};
        int n =sc.nextInt();
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                System.out.print(i);
                return;
            }
        }
        System.out.print("-1");
    }
}