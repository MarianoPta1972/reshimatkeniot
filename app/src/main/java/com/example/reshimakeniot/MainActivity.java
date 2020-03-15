package com.example.reshimakeniot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int PROFILE_INFO_REQUEST_CODE = 5489;
    Button btnS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnS = findViewById(R.id.btn1);
        RecyclerView ReshimatKeniot = findViewById(R.id.recyclerViewItem);
        ReshimatKeniot.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        final GroseryAdapter adapter = new GroseryAdapter();

        ReshimatKeniot.setAdapter(adapter);

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, grosserylist.class);
                startActivityForResult(intent, PROFILE_INFO_REQUEST_CODE);


            }
        });

    }
}
