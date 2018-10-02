/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stone
 */
public class Quiz {

    private List<Affirmation> affirmations;
    private int hits, mistakes;
    public Quiz(){
        this.initQuiz();
        this.hits = 0;
        this.mistakes = 0; 
    }
    private void initQuiz(){
        this.affirmations = new ArrayList<>();
        this.affirmations.add(new Affirmation("A guerra dos cem anos durou exatamente cem anos.",false));
        this.affirmations.add(new Affirmation("A lei áurea, que liberta os escravos,\n foi assinada por Pedro I.",false));
        this.affirmations.add(new Affirmation("Cristóvão Colombo chegou à América antes do \nPedro Álvares Cabral.",false));
        this.affirmations.add(new Affirmation("A capital do Tocantins é Palma",false));
        this.affirmations.add(new Affirmation("A cidade de Teresina, no Piauí,\n tem esse nome em homenagem ao Chacrinha.",false));
        this.affirmations.add(new Affirmation("Debaixo dos caracóis dos seus cabelos” \né uma música composta por Roberto Carlos\n para Caetano Veloso.",false));        
    }
    public int getTotallyAfirmation(){
        return this.affirmations.size();
    }
    public Affirmation getAttualyAffirmation(int index){
        Affirmation affirmation = new Affirmation(this.affirmations.get(index).getText(),this.affirmations.get(index).isChosse());
        return affirmation;
    }
    public boolean nextAffirmation(){
        return true;
    }
    public void answerAffirmation(String answer){
        if("hit".equals(answer)){
            this.hits+=1;
        }else{
            this.mistakes+=1;
        }
    }
    public int getTotallyHits(){
        return this.hits;
    }
    public int getTotallyMistakes(){
        return this.mistakes;
    }

}
