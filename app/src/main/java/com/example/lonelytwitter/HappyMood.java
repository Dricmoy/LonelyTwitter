package com.example.lonelytwitter;
import org.jetbrains.annotations.NotNull;
/**
 * Lab 1: CMPUT 301
 * Author: Dricmoy Bhattacharjee
 * Date: 05.09.2024
 * Description: Implementing Object Oriented Programming basics
 * Course: CMPUT 301, University of Alberta

 * Represents a specific mood indicating happiness.
 * This class extends the abstract `Mood` class and provides
 * concrete implementations for the abstract methods defined in `Mood`.
 */
import java.util.Date;

public class HappyMood extends Mood {

    public HappyMood() {
        super();
    }

    public HappyMood(Date date) {
        super(date);
    }

    @Override
    public String getMood() {
        return "Happy!";
    }

    @NotNull
    @Override
    public String toString() {
        return "HappyMood on " + getDate();
    }
}
