package com.example.eurotrivia;

import androidx.appcompat.app.AppCompatActivity;
import java.util.List;
import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);

        ListView listView = findViewById(R.id.countrieslistview);

        List<String> countries = new ArrayList<>();

        countries.add("France");
        countries.add("Greece");
        countries.add("Spain");
        countries.add("Turkey");
        countries.add("United Kingdom");


        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, countries);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    //click France
                    startActivity(new Intent(FactsActivity.this, FranceActivity.class));

                }

                else if (position==1){

                    startActivity(new Intent(FactsActivity.this, GreeceActivity.class));

                }

                else if (position==2){

                    startActivity(new Intent(FactsActivity.this, SpainActivity.class));

                }

                else if (position==3){

                    startActivity(new Intent(FactsActivity.this, TurkeyActivity.class));

                }

                else{

                    startActivity(new Intent(FactsActivity.this, UKActivity.class));

                }

            }
        });











    }
}
