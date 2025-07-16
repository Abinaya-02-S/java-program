class array5largest2small2{
    public static void main(String[]args)
    {
        int [] arr={10,25,3,99,77,45,1};
        int small1 = Integer.MAX_VALUE;
        int small2 = Integer.MAX_VALUE;
        int large1 = Integer.MIN_VALUE;
        int large2 = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]<small1)
            {
                small2 = small1;
                small1=arr[i];
            }
            else if (arr[i]<small2&&arr[i] != small1)
            {
                small2 = arr[i];
            }
            if(arr[i]>large1)
            {
                large2= large1;
                large1 =arr[i];
            }
            else if(arr[i]>large2 && arr[i] != large1)
            {
                large2=arr[i];
            }
        }
        System.out.println("Smallest number:"+ small2+","+small1);
        System.out.println("largest number:"+large2+","+large1);
    }
}