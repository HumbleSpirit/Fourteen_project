/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourteen_project;

/**
 *
 * @author Boro_s99
 */
public class Book implements IPrintable, IPrintable2{
    
    String name;
    String author;
    int year;
    
    Book()
    {
        this("none", "none", 0);
    }
    
    Book(String name, String author, int year)
    {
        this.name = name;
        this.author = author;
        this.year = year;
    }
    

      
    public void Print()
    {
        System.out.println(name +" "+ author +" "+ year);
    }
    
    
     
    
}
