    package com.pd.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnItemSelectedListener {
 //String[] langname = {"And1.1","And1.2"};

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Spinner sp = (Spinner)findViewById(R.id.Spinner);
        sp.setOnItemSelectedListener(this);

        List<String> langname = new ArrayList<String>();

            langname.add(" ");
            langname.add("Android");
            langname.add("Python");
            langname.add("DSA");
            langname.add("Data Science");
            langname.add("Swift");
            langname.add("Java");
            langname.add("Flutter");
            langname.add("PHP");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,langname);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        sp.setAdapter(adapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, adapterView.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}