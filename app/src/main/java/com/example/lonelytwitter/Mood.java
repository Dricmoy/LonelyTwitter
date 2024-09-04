/**
 * Lab 1: CMPUT 301
 * Author: Dricmoy Bhattacharjee
 * Date: 05.09.2024
 * Description: Implementing Object Oriented Programming basics
 * Course: CMPUT 301, University of Alberta

 * Represents an abstract base class for different moods.
 * This class encapsulates the concept of a mood by maintaining a date
 * and providing an abstract method for returning the mood as a string.
 * It includes a default constructor that initializes the date to the current date,
 * and a constructor that allows setting a specific date.

 * Subclasses should provide specific implementations for different moods
 * and override the `getMood()` method to return a string representation of the mood.
 */
package com.example.lonelytwitter;

import java.util.Date;

public abstract class Mood {
    private Date date;

    // Default constructor sets the date to the current date
    public Mood() {
        this.date = new Date();
    }

    // Constructor with a specific date
    public Mood(Date date) {
        this.date = date;
    }

    // Getter and setter for date
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Abstract method to represent the mood as a string
    public abstract String getMood();
}
