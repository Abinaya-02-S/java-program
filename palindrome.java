import java.util.Scanner;
class palindrome{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int rem,rev=0;
        int temp=n;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==temp)
        {
        System.out.print("Palindrome");
        }
        else{
        System.out.print("Not Palindrome");
        }
    }
}