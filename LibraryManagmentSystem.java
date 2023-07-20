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
public class LibraryManagmentSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Book Books[] = new Book[10];
        Books[Book.ID_No] = new Book (" Java","Smith",20.0);
        Books[Book.ID_No] = new Book(" Python","James",50.0);
        Books[Book.ID_No] = new Book(" C++","Mohamed",60.0);
        Books[Book.ID_No] = new Book(" C#","Ahmed",80.0);
        Books[Book.ID_No]= new Book("Database","Abdallah",100);
       
        Readers re[]= new Readers[10];
        
	re[Readers.id_red]=new Readers("aaa",111,"female","farrah","hatem","cairo","01011111","reader1@gmail.com");
	re[Readers.id_red]=new Readers("bbb",222,"female","marwa","adel","cairo","01022222","reader2@gmail.com");
	re[Readers.id_red]=new Readers("ccc",333,"male","muhammed","hisham","cairo","01033333","reader3@gmail.com");
	re[Readers.id_red]=new Readers("ddd",444,"male","abullah","adel","cairo","01044444","reader4@gmail.com");
	re[Readers.id_red]=new Readers("eee",555,"male","ahmed","magdy","cairo","01055555","reader5@gmail.com");
        re[Readers.id_red]=new Readers("fff",666,"male","abdullah","batran","Giza","01066666","reader6@gmail.com");
        
        
        Librarians li[]=new Librarians[10];
        
	li[Librarians.id_li]=new Librarians("aaa",111,"male","ahmed","hatem","cairo","01011111","li1@gmail.com");
	li[Librarians.id_li]=new Librarians("bbb",222,"male","mohammed","adel","cairo","01022222","li2@gmail.com");
	li[Librarians.id_li]=new Librarians("ccc",333,"female","malk","hisham","cairo","01033333","li3@gmail.com");
	li[Librarians.id_li]=new Librarians("ddd",444,"male","samir","adel","cairo","01044444","li4@gmail.com");
        
        Librarians q= new Librarians();
        Scanner input =new Scanner(System.in);
         boolean loginSucceed = false;
        System.out.println("-----libraray managemant system----- ");
   while(true){

         
    boolean loginSucceedLibrarian = false, loginSucceedReader = false;
     int menuOption ;
       Scanner scan = new Scanner(System.in);
       System.out.println("1.Librarin ");//fn
       System.out.println("2.Reader");//fn
       System.out.print("Enter choice:");//fn 
       menuOption = scan.nextInt();
       
       int cho=1;
       if(menuOption==1){
           int activeLibrarian = 0;
                        System.out.println("Enter the id: ");
                        Scanner in=new Scanner(System.in);
                        int s = in.nextInt();
                        System.out.println("Enter the password: ");
                        String p = in.next();
                        int count=0;
                        for (int i = 0; i<=9; i++){
                            if (li[i].login(p, s) == true){
                                activeLibrarian = i;
//                                loginSucceedLibrarian = true;
                                count++;
                                break;
                            }
                            else
                                loginSucceedLibrarian = false;
                        }
          if(count>0){
          System.out.println("How many Readers do you want to add ?");
          int d=scan.nextInt();
          Readers us[]=new Readers[d];
          for(int i=0;i<d;i++)
          {
              Readers R1=new Readers();
              us[i]=R1;
          }
          System.out.println("How many Books do you want add ?");
          int y=scan.nextInt();
          Book books[]=new  Book[y];
          for(int j=0;j<y;j++)
          {
              Book b1=new Book();
              books[j]=b1;
          }
           while (cho!=0){
      Scanner choice = new Scanner(System.in);
       System.out.println("1. Add Reader ");
       System.out.println("2. Remove Reader ");
       System.out.println("3. Add boook ");
       System.out.println("4.Remove book");
       System.out.println("5.serch book");
       System.out.println("6.Rent a book");
       System.out.println("7.Return book");
       System.out.println("8.Break");
       
       System.out.print("Enter choice:");
       cho = choice .nextInt();
   switch(cho)
   {
       case 1:
       //fn Add Reader 
          d=Librarians.Addreader(us, d, d);
       break;
        case 2:
       //fn Remove Reader
          System.out.println("Please,Enter your Ssn");
           int ssn=input.nextInt();
            d=q.Removereader(us, d, ssn, d);
                  
                  for (int i = 0; i < d; i++) {
                     System.out.println(us[i].getF_name());
                  }
       break;
        case 3:
       //fn Add Book 
            y=Librarians.addBook(books, y, y);
       break;
        case 4:
       //fn Remove Book
           System.out.println("Enter id to delete");
                int id= input.nextInt();
                y=Librarians.removeBook(books, y, id, y);
                 for (int i = 0; i < y; i++) {
                   System.out.println(books[i].getTitle());
                 }
       break;
        case 5:
       //fn sersh Book
            System.out.println("Enter Titel of book you want to sersh it");
             String Titel=input.next();
             
             y=q.sersh(books, y, Titel, y); 
       break;
       
       
        case 6:
            // fn RentBook
            System.out.println("Enter Titel of book you want to rent it");
        String titell=input.next();
        y=q.Rent(books, y, titell, y);
            break;
        case 7:
            //fn Returnbook
            System.out.println("please,Enter your ssn ");
                 int Ssn=input.nextInt();
                 q.returnn();
                  if (q.diff()/1000/60<4) {
                  System.out.println("Duration of the borrwing: "+q.diff()/1000+  " s  ");
                  System.out.println("Thank you Dear customar for sticking to the deadline");
                  }
                  else
                  {
                      d=q.Removereader(us, y, Ssn, y);
                      System.out.println("We are sory to remove you as you dont stick to the deadline ");
                 
                 
                 for (int i = 0; i < d; i++) {
                     System.out.println(us[i].getF_name());
                 }
                  }
            break;
        case 8:
            // Exit from Librarians
            break;
   }
           }
  
       
   }
           else{
           System.out.println(" INvalid passwoed ");
           }
       
      
    }
          
          
          
          
       
        if (menuOption == 2){
        
           int activeUser = 0;
                        System.out.println("Enter the id: ");
                        Scanner in=new Scanner(System.in);
                        int s = in.nextInt();
                        System.out.println("Enter the password: ");
                        String p = in.next();
                        int abc=0;
                        for (int i = 0; i<=9; i++){
                            if (re[i].login(p, s) == true){
                                activeUser = i;
//                                loginSucceedReader = true;
                                 abc++;
                                break;
                            }
                            else
                                loginSucceedReader = false;
                        } 
                        
            if(abc>0){
                
                System.out.println("How many Books do you want to add ?");
        int a=input.nextInt();
        Book boo[]=new Book[a];
        for(int z=0;z<a;z++)
        {
            Book b2=new Book();
            boo[z]=b2;
        }
                
                
            
     while (cho!=0){
      Scanner choice = new Scanner(System.in);
       System.out.println("1. Add book ");
       System.out.println("2. Search book  ");
       System.out.println("3. Remove book  ");
       System.out.println("4. Rennt book");
       System.out.println("5. Return book");
       
       System.out.println("enter choice");
       cho = choice .nextInt();
       
       switch(cho){
           case 1:
           //fn add 
          a=Librarians.addBook(boo, a, a);
       break;
           case 2:
           //fn search 
          System.out.println("Enter Titel of book you want to sersh it");
             String Titel=input.next();
             
             a=q.sersh(boo, a, Titel, a); 
       break;
           case 3:
           //fn Remove book
        System.out.println("Enter id to delete");
                int id= input.nextInt();
                a=Librarians.removeBook(boo, a, id, a);
                 for (int i = 0; i < a; i++) {
                   System.out.println(boo[i].getTitle());
                 }
       
       break;
           case 4:
           //fn Rent
       System.out.println("Enter Titel of book you want to rent it");
        String titell=input.next();
        a=q.Rent(boo, a, titell, a);
       break;
           case 5:
           //fn add
           
       break;
       
     }
       
       
       
     }
    
    
   

    }
       else{
       System.out.println("INvalid password");
    } 
    }
    }
    }
}

