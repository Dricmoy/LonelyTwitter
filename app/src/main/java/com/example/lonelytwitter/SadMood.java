/**
 * Lab 1: CMPUT 301
 * Author: Dricmoy Bhattacharjee
 * Date: 05.09.2024
 * Description: Implementing Object Oriented Programming basics
 * Course: CMPUT 301, University of Alberta

 * Represents a specific mood indicating sadness.
 * extends the abstract `Mood` class and provides
 * concrete implementations for the abstract methods defined in `Mood`.
 */
package com.example.lonelytwitter;
import java.util.Date;

public class SadMood extends Mood {

    public SadMood() {
        super();
    }

    public SadMood(Date date) {
        super(date);
    }

    @Override
    public String getMood() {
        return "Sad.";
    }

    @Override
    public String toString() {
        return "SadMood on " + getDate();
    }
}
