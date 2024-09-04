/**
 * Lab 1: CMPUT 301
 * Author: Dricmoy Bhattacharjee
 * Date: 05.09.2024
 * Description: Implementing Object Oriented Programming basics
 * Course: CMPUT 301, University of Alberta

 * This activity represents the main screen of the LonelyTwitter application.
 * Running it in Android Emulator will visualize the implementation of LonelyTwitter
 */
package com.example.lonelytwitter;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LonelyTwitterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lonely_twitter); // Ensure this matches your layout file

        TextView outputTextView = findViewById(R.id.outputTextView);

        //welcome msg
        String welcome_msg = "Dric's implementation of LonelyTwitter";
        outputTextView.setText(welcome_msg);

        // Instances of important and normal tweet
        Tweet importantTweet = new ImportantTweet("This is an important tweet!");
        Tweet normalTweet = new NormalTweet("Just a regular tweet.");

        // Output in the TextView
        StringBuilder output;
        output = new StringBuilder();

        //Testing normalTweet and importantTweet
        output.append(importantTweet.getMessage())
                .append(" - Important: ")
                .append(importantTweet.isImportant())
                .append("\n");

        output.append(normalTweet.getMessage())
                .append(" - Important: ")
                .append(normalTweet.isImportant())
                .append("\n");

        //Testing mood class
        Mood happyMood = new HappyMood();
        Mood sadMood = new SadMood();
        output.append("Current Mood: ")
                .append(happyMood.getMood())
                .append("\n");
        output.append("Current Mood: ")
                .append(sadMood.getMood())
                .append("\n");

        // Update the TextView with the output
        outputTextView.setText(output.toString());
    }
}
