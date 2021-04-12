/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

/**
 *
 * @author Ashna Ahmed
 */
public class Exercise1_2 {
    public static void main(String[] args) {
        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
        System.out.println(anAuthor);  
        anAuthor.setEmail("paul@nowhere.com");
        System.out.println(anAuthor);
        Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
        System.out.println(aBook);
        Book aBook2 = new Book("Harry Potter", new Author("J.K.Rowling", "ahteck@somewhere.com", 'f'), 59.95, 5000);
        System.out.println(aBook2);
    }
}
class Author
{
    private String name;
    private String email;
    private char gender;
    public Author(String name,String email,char gender)
    {
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String getName()
    {
        return this.name;
    }
    public String getEmail()
    {
        return this.email;
    }
    public char getGender()
    {
        return this.gender;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public String toString()
    {
        return (this.name+" ("+this.gender+") at "+this.email);
    }
}
class Book
{
    private String name;
    private Author author;
    private double price;
    private int qtyInStock=0;
    public Book (String name, Author author, double price)
    {
        this.name=name;
        this.author=author;
        this.price=price;
    }
    public Book (String name, Author author, double price,int qtyInStock)
    {
        this.name=name;
        this.author=author;
        this.price=price;
        this.qtyInStock=qtyInStock;
    }
    public String getName()
    {
        return this.name;
    }
    public Author getAuthor()
    {
        return this.author;
    }
    public double getPrice()
    {
        return this.price;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public int getQtyInStock()
    {
        return this.qtyInStock;
    }
    public void setQtyInStock(int qtyInStock)
    {
        this.qtyInStock=qtyInStock;
    }
    public String toString()
    {
        return ("\'"+this.name+"\'"+" by "+author.getName()+"("+author.getGender()+") at "+author.getEmail());
     
    }
}
