/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_assignment;
import java.io.Serializable;
/**
 *
 * @author waich
 */
public class ManageCreate implements Serializable{  //item 
    private String itemName;
    private String itemDescription;
    private String itemPrice;
    private String itemID;
    
    
    public ManageCreate(String itemName, String itemDescription, String itemPrice, String itemID){
        this.itemName=itemName;
        this.itemDescription=itemDescription;
        this.itemPrice=itemPrice;
        this.itemID=itemID;
       
    }
    public String getitemName(){
        return itemName;
    }
    public String getitemDescription(){
        return itemDescription;
    }
    public String getitemPrice(){
        return itemPrice;
    }
    public String getitemID(){
        return itemID;
    }
    
    public void setitemName(String itemName){
        this.itemName=itemName;
    }
    
    public void setitemDescription(String itemDescription){
        this.itemDescription=itemDescription;
        
    }
    public void setitemPrice(String itemPrice){
        this.itemPrice=itemPrice;
        
    }
    public void setitemID(String itemID){
        this.itemID=itemID;
    }
    
    @Override
public String toString() {
    return "Item Name: " + itemName + "\nItem Description: " + itemDescription +"\nItem Price"+ itemPrice +"\nItem ID" +itemID;
  }
   
    
}
