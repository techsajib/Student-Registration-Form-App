package com.techsajib.studentregistrationform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText name, fatherName, address, instituteName, departmentName, email, phone, bloodGroup, complain;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.name);
        fatherName = (EditText) findViewById(R.id.fatherName);
        address = (EditText) findViewById(R.id.address);
        instituteName = (EditText) findViewById(R.id.instituteName);
        departmentName = (EditText) findViewById(R.id.departmentName);
        email = (EditText) findViewById(R.id.Email);
        phone = (EditText) findViewById(R.id.phone);
        bloodGroup = (EditText) findViewById(R.id.bloodGroup);
        complain = (EditText) findViewById(R.id.complainBox);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,Main2Activity.class);

        intent.putExtra("nameKey", name.getText().toString());
        intent.putExtra("fatherNameKey",fatherName.getText().toString());
        intent.putExtra("adressKey", address.getText().toString());
        intent.putExtra("instituteKey", instituteName.getText().toString());
        intent.putExtra("departmentKey", departmentName.getText().toString());
        intent.putExtra("emailKey", email.getText().toString());
        intent.putExtra("phoneKey", phone.getText().toString());
        intent.putExtra("bloodKey", bloodGroup.getText().toString());
        intent.putExtra("complainKey", complain.getText().toString());

        startActivity(intent);
    }
}
