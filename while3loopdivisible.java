import java.util.Scanner;
class while3loopdivisible{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int count=0;
        while(count<5)
        {
            if((n%2==0)&&(n%3==0)&&(n%5==0))
            {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}