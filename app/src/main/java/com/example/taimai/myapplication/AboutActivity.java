package com.example.taimai.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity {
    private Button btnOK;
    private Button btnScance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        btnOK = (Button) findViewById(R.id.btnOK);
        btnScance = (Button) findViewById(R.id.btnScance);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AboutActivity.this, "Action OK", Toast.LENGTH_SHORT).show();
            }
        });

        btnScance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AboutActivity.this, "Action SCANEL", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }

}
