/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author stone
 */
public class TemperatureConverter {
    //Variables
    private double celsius; 
    private double fahrenheit;
    //Constructor
    public TemperatureConverter(){ 
       
    }
    //methods
   //setters and getters
    /**
     * @return the celsius
     */
    public double getCelsius() {
        return (this.fahrenheit - 32)/1.8;
    }

    /**
     * @param celsius the celsius to set
     */
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    /**
     * @return the fahrenheit
     */
    public double getFahrenheit() {
        return (1.8 * this.celsius)+32;
    }

    /**
     * @param fahrenheit the fahrenheit to set
     */
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    
}
