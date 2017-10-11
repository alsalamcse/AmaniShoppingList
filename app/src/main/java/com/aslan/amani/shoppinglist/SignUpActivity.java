package com.aslan.amani.shoppinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {
    private TextView etName;
    private TextView etEmail;
    private TextView password;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        etName = (TextView) findViewById(R.id.etName);
        etEmail = (TextView) findViewById(R.id.etEmail);
        password = (TextView) findViewById(R.id.password);
        save = (Button) findViewById (R.id.Save);



    }

}
