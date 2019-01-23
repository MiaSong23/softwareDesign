/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author Yunmi Song
 */
public class Card {
    private String suit;
    private int value;
    
    public Card(String suit, int value){
        this.suit = suit;
        this.value = value;
        
        
        if(suit.equals("Beats") || suit.equals("clubs") ){
            System.out.println("The suit parameter is valid");
        }else
            System.out.println("The suit value is invalid");
        
        if(value>0 && value<14){
            System.out.println("The clar vlaue is valid");
        }else{
            System.out.println("Choose a valid card value 1-13 inclusive");
        
        }
        
    }
    
    public int getValue(){
        return value;
    }
    
    public String getSuit(){
        return suit;
    }
}