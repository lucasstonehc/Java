/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingmeterGUI.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stone
 */
public class ParkingMeter {
    private double balance;
    private List<Ticket> tickets;
    public ParkingMeter(){
        this.initTickets();
    }
    private void initTickets(){
        this.tickets = new ArrayList<>();
        this.tickets.add(new Ticket(0.50,15));
        this.tickets.add(new Ticket(1.00,30));
        this.tickets.add(new Ticket(1.50,60));
        this.tickets.add(new Ticket(2.00,90));
        this.tickets.add(new Ticket(2.50,120));
    }
    public List<Ticket> tickets(){
        return this.tickets;
    }
    
    public int chosseTicket(int chosse){ 
        return this.tickets.get(chosse).getMinutes();  
    }
    public String ToString(int chosse){
        String str =  "**************\n\nESTACIONAMENTO\nTempo: " + this.tickets.get(chosse).getMinutes() +"\n**************\n\nTroco: "+ String.format("%.2f", this.balance - this.tickets.get(chosse).getPrice());
        return str;
    }
    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double change(double priceOfTicket){
        return this.balance-priceOfTicket;
    }
    
}
