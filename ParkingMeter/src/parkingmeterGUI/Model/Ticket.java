/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingmeterGUI.Model;

/**
 *
 * @author stone
 */
public class Ticket {
    
    private double price;
    private int minutes;
    public Ticket(double price, int minutes){
        this.price = price;
        this.minutes = minutes;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the minutes
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * @param minutes the minutes to set
     */
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
   
    public String ToString(){
        return "Preco: "+String.format("%.2f",this.price) +" Tempo: "+this.minutes;
    }
}
