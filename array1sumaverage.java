class array1sumaverage
{
    public static void main(String[]args){
        int [] arr = {10,20,40,50,30};
        int sum = 0;
        double average = 0;
        for(int i=0;i<arr.length;i++){
        sum += arr[i];
        }
        System.out.println(sum);
        average = sum/arr.length;
        System.out.println(average);
    }
}