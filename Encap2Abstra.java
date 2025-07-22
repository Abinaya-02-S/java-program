class book{
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;
    public book(String name,Author author,double price,int qtyInStock)
    {
        this.name = name;
        this.author = author;
        this.price=price;
        this.qtyInStock=qtyInStock;
    }
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public int getQtyInStock(){
        return qtyInStock;
    }
    public void setName(){
        this.name=name;
    }
    public void setAuthor(){
        this.author=author;
    }
    public void setPrice(){
        this.price=price;
    }
    public void setQtyInStock(){
        this.qtyInStock=qtyInStock;
    }
}
public class Encap2Abstra {
    public static void main(String[] args) {
        Author author = new Author("abi","abi630097@gmail.com",'F');
        book obj = new book("Harry Potter",author,599.9, 1200);
        System.out.println( "Name  : " + obj.getName());
        System.out.println("Author:"+obj.getAuthor());
        System.out.println("Price : " + obj.getPrice());
        System.out.println("qutyinStock: " + obj.getQtyInStock());
    }
}
