class patient{
    String patientName;
    double height;
    double weight;
    patient(String name,double height,double weight)
    {
        this.patientName= name;
        this.height=height;
        this.weight=weight;
    }
    double computerBMI()
    {
        return weight/(height*height);
    }
    public static void main(String[]args)
    {
        patient p = new patient("Abi",1.75,68.0);
        System.out.println(p.patientName);
        System.out.println(p.computerBMI());
    }
}