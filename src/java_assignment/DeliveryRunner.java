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


public class DeliveryRunner implements Serializable{
    private String deliverID;
    private String deliverName;
    private String deliverContact;
    private String deliverPassword;

    public DeliveryRunner(String deliverID, String deliverName, String deliverContact, String deliverPassword) {
        this.deliverID = deliverID;
        this.deliverName = deliverName;
        this.deliverContact = deliverContact;
        this.deliverPassword = deliverPassword;
    }

    public String getDeliverID() {
        return deliverID;
    }

    public void setDeliverID(String deliverID) {
        this.deliverID = deliverID;
    }

    public String getDeliverName() {
        return deliverName;
    }

    public void setDeliverName(String deliverName) {
        this.deliverName = deliverName;
    }

    public String getDeliverContact() {
        return deliverContact;
    }

    public void setDeliverContact(String deliverContact) {
        this.deliverContact = deliverContact;
    }

    public String getDeliverPassword() {
        return deliverPassword;
    }

    public void setDeliverPassword(String deliverPassword) {
        this.deliverPassword = deliverPassword;
    }

    

    @Override
    public String toString(){
        return"Delivery ID: " + deliverID + "\nDelivery Name: " + deliverName + "\nDelivery Contact: " + deliverContact + "\nDelivery Password: " + deliverPassword;
    }
}
