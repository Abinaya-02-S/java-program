import java.util.Scanner;
class array9line{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[4];
     if(n !=4)
     {
        System.out.print("please enter 4 integer");
     }
     for(int i=0;i<4;i++)
     arr[i] = sc.nextInt();
     System.out.println("orginal:");
     System.out.println(arr[0]+" "+arr[1]);
     System.out.println(arr[2]+" "+arr[3]);
     System.out.println("reversed:");
     System.out.println(arr[3]+" "+arr[2]);
     System.out.println(arr[1]+" "+arr[0]);
    }
}