package com.aslan.amani.shoppinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
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
        save.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (save==view)
        {

        }
    }
}
