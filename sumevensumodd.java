import java.util.Scanner;
class summevensumodd{
    public  static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x= sc.nextInt();
        int sum = 0;
        for (int i =0;i<n;i++)
        {
        if( x % 2 == 0)
        {
            sum += x;
            {
            System.out.print( " Even :" +sum);
            }
        }
        else if (x % 2 == 1)
        {
            sum += x;
            {
            System.out.print(" Odd :" +sum);
            }
        }
    }
}
}