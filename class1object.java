class box{
    double width;
    double height;
    double depth;
    box (double w,double h,double d)
    {
        width=w;
        height = h;
        depth = d;
    }
    double getVolume()
    {
        return width*height*depth;
    }
    public static void main(String[]args){
        box a = new box(5.0,3.0,2.0);
        System.out.print( a.getVolume());
    }
}