/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagmentsystem;

import java.util.Scanner;

/**
 *
 * @author Egypt_Laptop
 */
 import java.util.Scanner;
public class Book {
   

    private int ID;
    private String Title;
    private String Author;
    private double Price;
    public static int ID_No=0;
    
    public Book( String Title, String Author, double Price)
    {
     ID_No++;
     this.ID=ID_No;
     this.Title=Title;
     this.Author=Author;
     this.Price=Price; 
    }

    public Book() {
    }
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
    public void DisplayDetails()
    {
        System.out.println("ID: "+ID);
        System.out.println("Title: "+Title);
        System.out.println("Author: "+Author);
        System.out.println("Price: "+Price);
    }
    
    public static void Add_Book(Book NewBook)
    {
        NewBook= new Book("New Book "+Integer.toString(ID_No+1),"Author",100);
        System.out.println("You have added a new book:");
        NewBook.DisplayDetails();
     
    } 
    
      public static void Remove_Book(Book Books[])
    {
        
        System.out.println("Which Book do you want to remove?");
       Scanner input=new Scanner (System.in);
       int target=input.nextInt();
        ID_No--;
        for (int i=target-1; i<ID_No; i++)
        {
            Books[i]=Books[i+1];
            Books[i].setID(i+1);
        }
        System.out.println("The new array is");
        for (int j=0; j<ID_No;j++)
        {
            Books[j].DisplayDetails();
        }
    }
          public static void SearchBooks(Book Books[])
    {
         System.out.println("Which Book are you searching for?");
        Scanner input=new Scanner (System.in);
        int BookSearch=input.nextInt();
         if(BookSearch>Book.ID_No)
         {
             System.out.println("This ID is not valid");
         }
         else
         {
            for (int i=0; i<10;i++)
            {

                if (Books[i].getID()== BookSearch)
                {
            Books[i].DisplayDetails();
                    break;
                }
            }
         }
    }
    
}


