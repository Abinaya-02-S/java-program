class Fruit {
    String name;
    String taste;
    String size;

    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println(name + " tastes " + taste);
    }
}

class Apple extends Fruit {
    Apple(String size) {
        super("Apple", "Sweet", size);
    }

    public void eat() {
        System.out.println(name + " tastes " + taste + " and size is " + size);
    }
}

class Orange extends Fruit {
    Orange(String size) {
        super("Orange", "Tangy", size);
    }

    public void eat() {
        System.out.println(name + " tastes " + taste + " and size is " + size);
    }
}

public class Over1Poly {
    public static void main(String[] args) {
        Fruit a = new Apple("Medium");
        Fruit b = new Orange("Small");

        a.eat();
        b.eat(); 
    }
}

