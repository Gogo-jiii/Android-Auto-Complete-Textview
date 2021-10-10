package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    String[] data = {"a", "b", "c", "aa", "bb", "cc", "aaa", "bbb", "ccc", "abc"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        ArrayAdapter adapter = new ArrayAdapter(this,
                R.layout.support_simple_spinner_dropdown_item, data);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(2);
    }
}