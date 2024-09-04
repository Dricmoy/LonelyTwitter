/**
 * Lab 1: CMPUT 301
 * Author: Dricmoy Bhattacharjee
 * Date: 05.09.2024
 * Description: Implementing Object Oriented Programming basics
 * Course: CMPUT 301, University of Alberta

 * It extends the Tweet class and is used to create tweets that are not
 * considered important. The class overrides the `isImportant` method to
 * always return false and provides a string representation of the tweet.
 */
package com.example.lonelytwitter;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

public class NormalTweet extends Tweet {

    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(Date date, String message) {
        super(date, message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE; //hardcoded to return False
    }

    @NotNull // added this to suppress a Recently not Null warning
    @Override
    public String toString() {
        return "NormalTweet: " + getMessage();
    }
}

