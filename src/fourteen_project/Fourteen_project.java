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
        Book book = new Book("Leo", "War and Pease", 1869);
        myPrint(book);
        
        IPrintable ip1 = new Book();
        IPrintable ip2 = new Magazine();
        myPrint(new Book());
        myPrint(new Magazine());
        
        
        
        
    }
    
}
