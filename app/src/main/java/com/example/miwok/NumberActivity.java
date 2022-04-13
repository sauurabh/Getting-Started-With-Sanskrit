package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);



        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "एकम्", R.drawable.number_one));
        words.add(new Word("two", "द्वे", R.drawable.number_two));
        words.add(new Word("three", "त्रीणि", R.drawable.number_three));
        words.add(new Word("four", "चत्वारि", R.drawable.number_four));
        words.add(new Word("five", "पञ्च", R.drawable.number_five));
        words.add(new Word("six", "षट्", R.drawable.number_six));
        words.add(new Word("seven", "सप्त", R.drawable.number_seven));
        words.add(new Word("eight", "अष्ट", R.drawable.number_eight));
        words.add(new Word("nine", "नव", R.drawable.number_nine));
        words.add(new Word("ten", "दश", R.drawable.number_ten));

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
