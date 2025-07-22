class person{
    private String name;
    public person (String name)
    {
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
class Employee extends person{
   private double annualSalary;
   private int startyear;
   private String nationalInsuranceNumber;
   public Employee(String name,double annualSalary, int startyear,String nationalInsuranceNumber){
    super(name);
    this.annualSalary=annualSalary;
    this.startyear=startyear;
    this.nationalInsuranceNumber=nationalInsuranceNumber;
   } 
   public double getAnnualSalary(){
    return annualSalary;
   }
   public void setAnnualSalary()
   {
    this.annualSalary=annualSalary;
   }
   public int getStartYear(){
    return startyear;
   }
   public void setStartYear(){
    this.startyear=startyear;
   }
   public String getNationalInsuranceNumber(){
    return nationalInsuranceNumber;
   }
   public void setNationalInsuranceNumber(){
    this.nationalInsuranceNumber=nationalInsuranceNumber;
   }
}
class Inheritance2{
    public static void main (String[] args){
        Employee b = new Employee("Abinaya",50000.0,2026,"abi123");
        System.out.println(b.getName());
        System.out.println(b.getAnnualSalary());
        System.out.println(b.getStartYear());
        System.out.println(b.getNationalInsuranceNumber());
    }
}