package com.aslan.amani.shoppinglist;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView password;
    private TextView email;
    private Button forgot;
    private Button btnSignIn;
    private Button btnSignup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        password=(TextView) findViewById (R.id.password);
        email= (TextView) findViewById (R.id.email) ;
        forgot= (Button)findViewById(R.id.forgot);
        btnSignIn= (Button)findViewById(R.id.signIn);
        btnSignup=(Button)findViewById(R.id.signUp);


         btnSignIn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view)
    {
if (btnSignIn==view)
        {

        }

    }
}
