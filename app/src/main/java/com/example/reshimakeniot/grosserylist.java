package com.example.reshimakeniot;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import org.json.JSONException;
import org.json.JSONObject;

public class grosserylist extends AppCompatActivity {
    Button btnF;
    CheckBox milk,bread,oil,flour,soap,salt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grosserylist);


        btnF =findViewById(R.id.btnFinish);
        milk =findViewById(R.id.checkBox);
        bread =findViewById(R.id.checkBox2);
        oil =findViewById(R.id.checkBox3);
        flour = findViewById(R.id.checkBox4);
        soap = findViewById(R.id.checkBox5);
        salt = findViewById(R.id.checkBox6);

        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JSONObject object = new JSONObject();
                try {
                    if (milk.isChecked()){object.put("milk","true");} else {object.put("milk","false");};
                    if (bread.isChecked()){object.put("bread","bread");}else {object.put("bread","false");};
                    if (oil.isChecked()){object.put("oil","oil");}else {object.put("oil","false");};
                    if (flour.isChecked()){object.put("flour","flour");} else {object.put("flour","false");};
                    if (soap.isChecked()){object.put("soap","milk");} else {object.put("soap","false");};
                    if (salt.isChecked()){object.put("salt","milk");} else {object.put("salt","false");};
                } catch (JSONException e) {
                    e.printStackTrace();
                }


            Intent intent = new Intent();
            intent.putExtra("list", object.toString());
            setResult (Activity.RESULT_OK,intent);
            finish();
        }
        });



    }
}
