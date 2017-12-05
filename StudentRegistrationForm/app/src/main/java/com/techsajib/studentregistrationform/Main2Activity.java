package com.techsajib.studentregistrationform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tx1, tx2, tx3, tx4, tx5, tx6, tx7, tx8, tx9;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tx1 = (TextView) findViewById(R.id.nameText);
        tx2 = (TextView) findViewById(R.id.fathernameText);
        tx3 = (TextView) findViewById(R.id.addressText);
        tx4 = (TextView) findViewById(R.id.instituteNameText);
        tx5 = (TextView) findViewById(R.id.departmentNameText);
        tx6 = (TextView) findViewById(R.id.emailText);
        tx7 = (TextView) findViewById(R.id.phoneText);
        tx8 = (TextView) findViewById(R.id.bloodGroupText);
        tx9 = (TextView) findViewById(R.id.complainText);

        button = (Button) findViewById(R.id.backButton);

        Intent intent = getIntent();

        tx1.setText(intent.getStringExtra("nameKey"));
        tx2.setText(intent.getStringExtra("fatherNameKey"));
        tx3.setText(intent.getStringExtra("adressKey"));
        tx4.setText(intent.getStringExtra("instituteKey"));
        tx5.setText(intent.getStringExtra("departmentKey"));
        tx6.setText(intent.getStringExtra("emailKey"));
        tx7.setText(intent.getStringExtra("phoneKey"));
        tx8.setText(intent.getStringExtra("bloodKey"));
        tx9.setText(intent.getStringExtra("complainKey"));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
