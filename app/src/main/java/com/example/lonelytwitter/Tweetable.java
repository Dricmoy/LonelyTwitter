/**
 * Lab 1: CMPUT 301
 * Author: Dricmoy Bhattacharjee
 * Date: 05.09.2024
 * Description: Implementing Object Oriented Programming basics
 * Course: CMPUT 301, University of Alberta

 * interface for tweets
 */
 package com.example.lonelytwitter;
import java.util.Date;

public interface Tweetable {
    String getMessage();
    Date getDate();
}
