import java.util.Scanner;
class if5agepercentage{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int m = sc.nextInt();
        if(f>=1&&f<=58)
        {
            System.out.println("8.2%");
        }
         else if (f>=59&&f<=100)
         {
            System.out.println("9.2%");
         }
        if(m>=1&&m<=58)
        {
            System.out.println("8.4%");
        }
         else if (m>=59&&m<=100)
         {
            System.out.println("10.5%");
         }
   }
}