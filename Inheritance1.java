class Animal{
    public void eat()
    {
        System.out.println("Animal is eating");
    }
    public void Sleep()
    {
        System.out.println("Animal is sleeping");
    }
}
    class Bird extends Animal{
        public void eat()
        {
            System.out.println("Birds is eating");
        }
        public void Sleep(){
            System.out.println("Birds is sleeping");
        }
        public void fly()
        {
            System.out.println("Brids is flying");
        }
}
public class Inheritance1{
    public static void main (String[] args)
    {
        Animal b = new Animal();
        b.eat();
        b.Sleep();
        System.out.println();

        Bird s = new Bird();
        s.eat();
        s.Sleep();
        s.fly();
    }
}