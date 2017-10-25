package com.aslan.amani.shoppinglist;

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

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView etName;
    private TextView etEmail;
    private TextView password;
    private Button save;
    private TextView repassword;
    private 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        etName = (TextView) findViewById(R.id.etName);
        etEmail = (TextView) findViewById(R.id.etEmail);
        password = (TextView) findViewById(R.id.password);
        save.setOnClickListener(this);
        repassword=(TextView)findViewById(R.id.repassword);



    }

    @Override
    public void onClick(View v) {

        {
          dataHandler();
        }
    }


     private void dataHandler()
    {
        String stEmail= etEmail.getText().toString();
        String stName= etName.getText().toString();
        String stPassw=password.getText().toString();
          boolean isOk= true; // to chek if all feilds are filled correctly
        if( (stEmail.length()==0) || stEmail.indexOf('0')<1)
        {
            etEmail.setError("wrong email");
            isOk=false;

        }
        if ((stPassw.length()<8)||stPassw.equals(stPassw)==false)
        {
password.setError("bad password");
            isOk=false;
        }
        if (isOk)
           creatAcount();(etEmail,password);

    }



    private void creatAcount() {
        auth.createUserWithEmail.addOnCompleteListener(SignUpActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    Toast.makeText(SignUpActivity.this, "Authentication Successful.", Toast.LENGTH_SHORT).show();
                    //updateUserProfile(task.getResult().getUser());
                    finish();
                }
                else
                {
                    Toast.makeText(SignUpActivity.this, "Authentication failed."+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    task.getException().printStackTrace();
                }
            }
        });
    }


}

