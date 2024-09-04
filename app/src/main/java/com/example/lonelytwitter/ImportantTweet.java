/**
 * Lab 1: CMPUT 301
 * Author: Dricmoy Bhattacharjee
 * Date: 05.09.2024
 * Description: Implementing Object Oriented Programming basics
 * Course: CMPUT 301, University of Alberta

 * It extends the Tweet class and is used to create tweets that are
 * considered important. The class overrides the `isImportant` method to
 * always return True and provides a string representation of the tweet.
**/

package com.example.lonelytwitter;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

public class ImportantTweet extends Tweet {

    public ImportantTweet(String message) {
        super(message);
    }

    public ImportantTweet(Date date, String message) {
        super(date, message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    @NotNull // added this to suppress a Recently not Null warning
    @Override
    public String toString() {
        return "ImportantTweet: " + getMessage();
    }

}