/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_assignment;

/**
 *
 * @author Danish
 */
import java.io.Serializable;


public class Vendor implements Serializable{
    private String vendorID;
    private String vendorName;
    private String vendorContact;
    private String vendorPassword;

    public Vendor(String vendorID, String vendorName, String vendorContact, String vendorPassword) {
        this.vendorID = vendorID;
        this.vendorName = vendorName;
        this.vendorContact = vendorContact;
        this.vendorPassword = vendorPassword;
    }

    public String getVendorID() {
        return vendorID;
    }

    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorContact() {
        return vendorContact;
    }

    public void setVendorContact(String vendorContact) {
        this.vendorContact = vendorContact;
    }

    public String getVendorPassword() {
        return vendorPassword;
    }

    public void setVendorPassword(String vendorPassword) {
        this.vendorPassword = vendorPassword;
    }

    @Override
    public String toString(){
        return"VendorID: " + vendorID + "\nVendorName: " + vendorName + "\nVendorContact: " + vendorContact + "\nVendorPassword: " + vendorPassword;
    }
}
