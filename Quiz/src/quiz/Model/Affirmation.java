/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.Model;

/**
 *
 * @author stone
 */
public class Affirmation {
    
    private final String text;
    private final boolean chosse;
    public Affirmation(String text, boolean chosse){
        this.text = text;
        this.chosse = chosse;
    }
    public String getText() {
        return text;
    }
    public boolean isChosse() {
        return chosse;
    }
    
}
