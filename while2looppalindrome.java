import java.util.Scanner;
class while2looppalindrome
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a =n;
        int r = 0;
        while(n>0)
        {
            int rem=n%10;
            r = r*10+rem;
            n=n/10;
        }
        if(r == a)
            {
                System.out.print("palindrome");
            }
        else
        {
            System.out.print("not palindrome");
        }
    }
}