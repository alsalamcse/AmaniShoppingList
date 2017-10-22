package com.aslan.amani.shoppinglist;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView password;
    private TextView email;
    private Button forgot;
    private Button btnSignIn;
    private Button btnSignup;
    private FirebaseAuth auth;
    private FirebaseUser firbaseUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        password=(TextView) findViewById (R.id.password);
        email= (TextView) findViewById (R.id.email) ;
        forgot= (Button)findViewById(R.id.forgot);
        btnSignIn= (Button)findViewById(R.id.signIn);
        btnSignup=(Button)findViewById(R.id.signUp);
        auth= FirebaseAuth.getInstance();
        firbaseUser=auth.getCurrentUser();

         if (firbaseUser == null) {
            // Not signed in, launch the Sign In activity
            startActivity(new Intent(this,MainActivity.class));
            finish();
            return;
        } else {
            String userName = firbaseUser.getDisplayName();
            if(firbaseUser.getPhotoUrl() != null) {
                String   photoUrl = firbaseUser.getPhotoUrl().toString();
            }
        }


         btnSignup.setOnClickListener(this);
    }


    @Override
    public void onClick(View view)
    {
        {

        }

    }



}
