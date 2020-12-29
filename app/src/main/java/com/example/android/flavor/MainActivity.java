package com.example.android.flavor;

/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.android.flavor.R;
import com.example.android.flavor.Word;
import com.example.android.flavor.WordAdapter;

import java.util.ArrayList;

/**
 * {@link MainActivity} shows a list of Android platform releases.
 * For each release, display the name, version number, and image.
 */
public class MainActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showres);

        final ArrayList<Word> word = new ArrayList<Word>();
//        for(int i = 0; i<10; i++){
//            word.add(i+"");
//        }

        word.add(new Word(1, "One", R.drawable.number_one, R.raw.number_one));
        word.add(new Word(2, "Two", R.drawable.number_two, R.raw.number_two));
        word.add(new Word(3, "Three", R.drawable.number_three, R.raw.number_three));
        word.add(new Word(4, "Four", R.drawable.number_four, R.raw.number_four));
        word.add(new Word(5, "Five", R.drawable.number_five, R.raw.number_five));
        word.add(new Word(6, "Six", R.drawable.number_six, R.raw.number_six));
        word.add(new Word(7, "Seven", R.drawable.number_seven, R.raw.number_seven));
        word.add(new Word(8, "Eight", R.drawable.number_eight, R.raw.number_eight));
        word.add(new Word(9, "Nine", R.drawable.number_nine, R.raw.number_nine));
        word.add(new Word(10, "Ten", R.drawable.number_ten, R.raw.number_ten));
        word.add(new Word(1, "One", R.drawable.number_one, R.raw.number_one));
        word.add(new Word(2, "Two", R.drawable.number_two, R.raw.number_two));
        word.add(new Word(3, "Three", R.drawable.number_three, R.raw.number_three));
        word.add(new Word(4, "Four", R.drawable.number_four, R.raw.number_four));
        word.add(new Word(5, "Five", R.drawable.number_five, R.raw.number_five));
        word.add(new Word(6, "Six", R.drawable.number_six, R.raw.number_six));
        word.add(new Word(7, "Seven", R.drawable.number_seven, R.raw.number_seven));
        word.add(new Word(8, "Eight", R.drawable.number_eight, R.raw.number_eight));
        word.add(new Word(9, "Nine", R.drawable.number_nine, R.raw.number_nine));
        word.add(new Word(10, "Ten", R.drawable.number_ten, R.raw.number_ten));




        //Setting Up Array Adapter for Word class
        WordAdapter itemsAdapter = new WordAdapter(this, word);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Word words = word.get(i);
                mMediaPlayer = MediaPlayer.create(MainActivity.this, words.getAudioResourceId());

                Log.v("NumbersActivity", "Current word: " + word.toString());

                // Start the audio file
                mMediaPlayer.start();
            }
        });

    }
}
