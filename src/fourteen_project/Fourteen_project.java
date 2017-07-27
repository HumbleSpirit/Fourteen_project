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
public class Fourteen_project {

    static void myPrint(IPrintable p) //p -  интерфейсная ссылка
    {
        p.Print();
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book book1 = new Book("Leo Tolstoy", "War and Pease", 1869);
        myPrint(book1); // Вызов метода класса майн
        
        IPrintable ip1 = new Book(); //Вызов метода интерфейса
        IPrintable ip2 = new Magazine(); //Вызов метода интерфейса
        myPrint(new Book()); 
        myPrint(new Magazine());
        
        
        book1.Print2(); // Вызов метода интерфейса по умолчанию
        IPrintable2.Print3(); // Вызов статического метода интерфейса
        
        
        
        
    }
    
}
