package com.example.armin.cddma;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

public class Library extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView lst;
    final String[] disease_name=new String[]{"Disease1", "Disease2", "Disease3", "Disease4", "Disease5",
            "Disease6", "Disease7", "Disease8", "Disease9", "Disease10"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        lst = (ListView) findViewById(R.id.disease_list);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, disease_name);
        lst.setAdapter(adapter);
        lst.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        TextView txt=(TextView)view;
        Toast.makeText(this, txt.getText()+" is selected", Toast.LENGTH_SHORT).show();
    }
}
