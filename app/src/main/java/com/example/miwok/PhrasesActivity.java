package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "त्वं कुत्र गचछसी"));
        words.add(new Word("What is your name?", " \n" +
                "तव नाम किम्?"));
        words.add(new Word("My name is...", "मम नाम..."));
        words.add(new Word("How are you?", "कथम् अस्ति भवान् /भवती?"));
        words.add(new Word("I’m feeling good.", " अहं कुशली।"));
        words.add(new Word("Please", "कृपया"));
        words.add(new Word("Thank You.", "धन्यवादः।"));
        words.add(new Word("You're welcome.", "सुस्वागतम्."));
        words.add(new Word("Good morning.", "शुभ प्रभातम"));
        words.add(new Word("Good night.", "शुभ रात्रि "));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}

