class array2minmax{
    public static void main(String[]args)
    {
        int [] arr = {10,33,59,47,12,};
        int min = arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println("maximum:"+max);
        System.out.println("minimum:"+min);
    }
}