/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagmentsystem;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Egypt_Laptop
 */
public class Readers extends Users {
     public  String type;
    public String f_name;
    public  String l_name;
    public  String address;
    public   String cell_phone;
    private  String email;
    private  String password;
    public int id;
    public static int id_red=0;
    Date d;
    private long returnTime;
     private long rentTime;

    Book Books[] = new Book[10];
    String []waiting=new String[5];
    public Readers(){}
  public Readers(String password,int id,String type,String f_name,String l_name,String address,String cell_phone,String email)
    { 
   

        id_red++;
        
        this.id=id;
        this.password=password;
    }

    public Readers(String type, String f_name, String l_name, String address, String cell_phone, String email, String password, int id, Date d, long returnTime, long rentTime, int Ssn, String family_name) {
        super(Ssn, family_name);
        this.type = type;
        this.f_name = f_name;
        this.l_name = l_name;
        this.address = address;
        this.cell_phone = cell_phone;
        this.email = email;
        this.password = password;
        this.id = id;
        this.d = d;
        this.returnTime = returnTime;
        this.rentTime = rentTime;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }


     
    public static void searchbook(String name)
    {
        System.out.println("enter the name of the book that you want:");
        Scanner x=new Scanner(System.in);
        String n=x.next();
        Book []A = new Book[10];
        for(int i=0;i<10;i++)
        {
           if((A[i]!=null)&&(A[i].getTitle().equals(name)))
           {
               A[i].DisplayDetails();
               
           }
              }
        
    }
    public  void searchreader(Readers re[])
    {
        System.out.println("enter the name of the reader that you search for:");
        Scanner y=new Scanner(System.in);
        System.out.println("enter the name of the reader that you search for:");
        String name =y.next();
        String reader=null;
        for(int i=0;i<10;i++)
        {
           if(re[i]!=null&&re[i].f_name.equals(name))
           {
               System.out.println("existed");
               displayreadersdata();
           }
        }
        
    }
     public void setDate(){
        this.d=new Date();
    }
     public static void orderlist(String[]waiting)
     {
         for(int i=0;i<10;i++)
         {
             System.out.println("Enter the first name");
             Scanner n=new Scanner (System.in);
             waiting[i]=n.next();
         }
         
         
     }
    
    public void rent_book()
    {
     System.out.println("Do you want to rent this book?"); 
	System.out.println( "PRESS 1 if Yes \n");
	Scanner choic  = new Scanner(System.in);
        int pp= choic.nextInt();
        if(pp==1)
                    {
                     System.out.println("Enter the title of book that you wanted to rent");
	             String i=choic.next();
                     for (int z = 0; z<Book.ID_No;z++)
                         {
                          if (i!= Books[z].getTitle())
	                      {
	                       System.out.println( "Purchase completed successfuly.\n\n");
                                 setDate();
                                  System.out.println("the date:"+getDate());
           
       
       
	                       Book.Remove_Book(Books); 
	                      }
        else
                             {
	                      System.out.println( "Purchase failed, no available copies \n\n");
                              System.out.println("you are added to the order list, when copies are available we will give one to you");
                              
                             }
                         }
                    }
                      
                    
        else
                    {
                      System.out.println("\n");
                    }
	            
    }
                   

        
    public void return_book()
    {
         
        Date y = new Date();
        returnTime = y.getTime();
       
    }
    public long diff(){
        return returnTime-rentTime;
    }
    
        public Date getDate(){
            return d;
    }
        

    public  void displayreadersdata()
    {
                System.out.print("the reader name is:"+f_name);
                System.out.print(l_name);
                System.out.println("the type:"+type);
                System.out.println("the cell phone"+cell_phone);
                System.out.println("the email"+email);
                
            }

    public void setType(String type) {
        this.type = type;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCell_phone(String cell_phone) {
        this.cell_phone = cell_phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void setId_red(int id_red) {
        Readers.id_red = id_red;
    }

    public void setD(Date d) {
        this.d = d;
    }

    public void setReturnTime(long returnTime) {
        this.returnTime = returnTime;
    }

    public void setRentTime(long rentTime) {
        this.rentTime = rentTime;
    }

    public void setBooks(Book[] Books) {
        this.Books = Books;
    }

    public String getType() {
        return type;
    }

    public String getF_name() {
        return f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public String getAddress() {
        return address;
    }

    public String getCell_phone() {
        return cell_phone;
    }

    public String getEmail() {
        return email;
    }

    public static int getId_red() {
        return id_red;
    }

    public Date getD() {
        return d;
    }

    public long getReturnTime() {
        return returnTime;
    }

    public long getRentTime() {
        return rentTime;
    }

    public Book[] getBooks() {
        return Books;
    }

    public void setSsn(int Ssn) {
        this.Ssn = Ssn;
    }

    public int getSsn() {
        return Ssn;
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

