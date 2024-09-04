/**
 * Lab 1: CMPUT 301
 * Author: Dricmoy Bhattacharjee
 * Date: 05.09.2024
 * Description: Implementing Object Oriented Programming basics
 * Course: CMPUT 301, University of Alberta

 * The class implements the Tweetable interface and contains an abstract method
 * `isImportant()` that must be implemented by subclasses to determine if the tweet
 * is considered important.
 */

package com.example.lonelytwitter;

import java.util.Date;

public abstract class Tweet implements Tweetable{ //abstract stuff #instruction 4
    private Date date;
    private String message;
    //private meaning class only

    public Tweet(String message){ //constructor with only message
        this.message = message;
    }

    public Tweet(Date date, String message){ //constructor with dates and message
        this.date = date;
        this.message = message;
    }
    //End of instruction 1

    //getters
    public Date getDate(){
        return date;
    }

    public String getMessage(){
        return message;
    }

    //Setters
    public void setMessage(String message){
        this.message = message;
    }

    public void setDate(Date date){ //no return, so void
        this.date = date;
    }

    //End of Instruction 2

    public abstract Boolean isImportant(); //will be implemented by subclasses
    // end of instruction 4
}
