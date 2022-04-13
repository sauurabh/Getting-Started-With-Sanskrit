package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);


        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red", "लोहितः, रक्तवर्णः", R.drawable.color_red));
        words.add(new Word("mustard yellow", "पीतः, हरिद्राभः", R.drawable.color_mustard_yellow));

        words.add(new Word("green", "हरितः, पलाशः", R.drawable.color_green));
        words.add(new Word("brown", "श्यावः, कपिशः", R.drawable.color_brown));
        words.add(new Word("gray", "धूसरः, धूषरः", R.drawable.color_gray));
        words.add(new Word("black", "श्यामः, कालः", R.drawable.color_black));
        words.add(new Word("white", "श्वेतः", R.drawable.color_white));

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

