import java.util.Scanner;
class if3arrangecharacter{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        char s=sc.next().charAt(0);
        char e =sc.next().charAt(0);
        if( s <  e)
        {
            System.out.print(s+","+ e);
        }
        else
        {
            System.out.print( e+","+  s);
        }
    }
}