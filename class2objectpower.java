class calculator
{
    public static int powerInt(int num1,int num2){
        return (int)Math.pow(num1,num2);
    }
    public static double powerDouble(double num1,double num2){
        return(double)Math.pow(num1,num2);
    }
    public static void main(String[]args)
    {
        int a = calculator.powerInt(2,3);
        double s = calculator.powerDouble(2.5,3);
        System.out.println(a);
        System.out.println(s);
    }
}