/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppub.Model;

/**
 *
 * @author stone
 */
public class Account {
    private double value;
    private double tip;
    private int people;
    public Account(){
        
    }
    public void setValue(double value){
        this.value = value;
    }
    public void setTip(int tip){
        this.tip = (tip * this.value)/100;
    }
    public void setPeople(int people){
        this.people = people;
    }
    public double getTotallyByPerson(){
        return (this.value-this.tip)/this.people;
    }
    
}
