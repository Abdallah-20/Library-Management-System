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
public abstract class Users {
    public String Name;
    public int ID;
    public int Ssn;
    public String family_name;
    public String address;
    public String email;

    public Users(int Ssn, String family_name) {
        this.Ssn = Ssn;
        this.family_name = family_name;
    }

    public Users(String Name, int ID, int Ssn, String address, String email) {
        this.Name = Name;
        this.ID = ID;
        this.Ssn = Ssn;
        this.address = address;
        this.email = email;
    }

    public Users() {
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSsn(int Ssn) {
        this.Ssn = Ssn;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return Name;
    }

    public int getID() {
        return ID;
    }

    public int getSsn() {
        return Ssn;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
    
    
    
}
