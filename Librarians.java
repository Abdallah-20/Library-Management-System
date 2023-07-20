/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagmentsystem;

/**
 *
 * @author Egypt_Laptop
 */
import java.util.Date;
import java.util.Scanner;
public class Librarians extends Book {
    
    public String password;
    public int id;
    public String type;
    public String f_name;
    public String l_name;
    public String address;
    public String cell_phone;
    public String email;
    public static int id_li =0;
    Readers re[]= new Readers[10];
    Date d;
    public long returnTime;
    public long rentTime;

    public Librarians(String password, int id, String type, String f_name, String l_name, String address, String cell_phone, String email) {
        this.password = password;
        this.id = id;
        this.type = type;
        this.f_name = f_name;
        this.l_name = l_name;
        this.address = address;
        this.cell_phone = cell_phone;
        this.email = email;
        id_li ++;
    }
    
    
    
    public Librarians(String Title, String Author, double Price) {
        super(Title, Author, Price);
        id_li ++;
    }

    public Librarians() {
    }
     public static int addBook(Book[] books,int length,int x)
    {
         Scanner input=new Scanner(System.in);
         for(int i=0;i<length;i++)
        {
            System.out.println("Enter titel of book number"+(i+1)+":");
            String z=input.next();
            books[i].setTitle(z);
            System.out.println("Enter author of book number"+(i+1)+":");
            String q=input.next();
            books[i].setAuthor(q);
            int l=i+1;
            books[i].setID(l);
            System.out.println("Enter price of book number"+(i+1)+":");
            double a=input.nextDouble();
            books[i].setPrice(a);
        }
         return x;
    }
      public void setDate(){
        this.d=new Date();
    }
      
    public long diff(){
        return returnTime-rentTime;
    }
    
        public Date getDate(){
            return d;
    }
    
    public int Rent(Book[] books,int length,String titell,int x){
        Scanner scan=new Scanner(System.in);

          int k;
 int index=0;
int count =0;
//        if(books[k].getTitle().equals(titell)){
          for(k=0; k<length;k++)
        {
           if(books[k].getTitle().equals(titell)){
             
              count++;
              index=k;
                
           }
        }
          if(count>0){
                  System.out.println("The book Titel:"+books[index].getTitle());
                System.out.println("The book author:"+books[index].getAuthor());
                System.out.println("The book Id:"+books[index].getID());
                System.out.println("The book Price:"+books[index].getPrice());
                setDate();
                System.out.println("The Date:"+getDate());
           
                  int j ;
        for ( j = 0; j < length; j++) {
            if (books[j].getTitle().equals(titell)) {
                break;
            }
            
        }
       
        for (int i = j; i <length-1; i++) {
            books[i]=books[i+1];
            
        }
        return x-1;
          }
          else{
            System.out.println("The Book is not Exist and we will add you to the order list So Enter your Data ,Please");
            System.out.println("Enter your name :");
            String a=scan.next();
            System.out.println("Enter your Ssn :");
            int y=scan.nextInt();
          }







        Date p = new Date();
        rentTime = p.getTime();
        return x;
    } 
     public void returnn(){
       
        
        Date y = new Date();
        returnTime = y.getTime();
       
    }
     public  int sersh(Book[] books,int length,String titel,int x)
    {
       int cunt=0;
         for(int k=0;k<length;k++)
        {
           if(books[k].getTitle().equals(titel)){
               System.out.println("The book Title:"+books[k].getTitle());
               System.out.println("The book Author :"+books[k].getAuthor());
                System.out.println("The book id:"+books[k].getID());
                System.out.println("The book price:"+books[k].getPrice());
              cunt++;
           }
          
        }
          if(cunt>0){
               
//                System.out.println("The book Title:"+books[k].getTitle());
//                System.out.println("The book Author :"+books[k].getAuthor());
//                System.out.println("The book id:"+books[k].getTitle());
//                System.out.println("The book price:"+books[k].getPrice());
           }
           else{
               System.out.println("The Book is not found");
           }
         return x;
    }
     public static int removeBook(Book[] books,int length,int id,int x){
        int j ;
        for ( j = 0; j < length; j++) {
            if (books[j].getID()==id) {
                break;
            }
            
        }
       
        for (int i = j; i <length-1; i++) {
            books[i]=books[i+1];
            
        }
        return x-1;
        
    }
     public static int Addreader(Readers us[],int length,int x)
     {
         Scanner input=new Scanner(System.in);
         for(int i=0;i<length;i++)
         {
            
             System.out.println("Enter name of Reader number"+(i+1)+":");
             String y=input.next();
             us[i].setF_name(y);
             int e=i+1;
             us[i].setId(e);
             System.out.println("Enter Ssn of Reader number"+(i+1)+":");
             int w=input.nextInt();
             us[i].setSsn(w);
         }
              return x;
             }
     public int Removereader(Readers us[],int length,int Ssn,int x)
     {
         int a;
         for(a=0;a<length;a++)
         {
             if(us[a].getSsn()==Ssn)
                 break;
         }
         for(int i=0;i<length-1;i++)
         {
             us[a]=us[a+1];
         }
         return x-1;
     }
     public boolean login(String pass, int id2)
    {
        boolean correct = false;
        for(int i=0; i<=9; i++)
        {
            if((id2 == id)&&(pass.equals(password))){
                correct = true;
                break;
            }
            else{
                correct = false;
            }
        }
        if (correct){
            System.out.println("Login success.");
            return true;
        }
        else {
            System.out.println("Invalid login.");
            return false;
        }
    }
     
     
    
    
}
