import java.util.Scanner;
class if4charintspecial{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        char n = sc.next().charAt(0);
        if((n >= 'a' && n<='z')||( n >='A' && n<= 'Z'))
        {
            System.out.print("Alpheats");
        }
        else if(n>='0' && n<='9')
        {
            System.out.print("Digits");
        }
        else
        {
            System.out.print("Special");
        }
    }
}