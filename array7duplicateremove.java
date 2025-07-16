class array7duplicateremove
{
    public static void main (String[]args)
    {
        int [] arr = {12,34,12,45,67,89};
        for(int i=0;i<arr.length;i++)
    {
    boolean d = false;
    for(int j=i+1;j<arr.length;j++)
    if(arr[i]==arr[j])
        {
            d=true;
            break;
        }
        if(!d)
        {
           System.out.print(arr[i]+" ");
        }
    }
    }
}