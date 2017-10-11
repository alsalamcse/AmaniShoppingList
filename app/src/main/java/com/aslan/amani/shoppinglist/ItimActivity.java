package com.aslan.amani.shoppinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
//                                                 1.
public class ItimActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView ItemName;
    private TextView etAmount;
    private TextView etUnits;
    private ImageButton iBtnImage;
    private Button BtnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itim);
        ItemName=(TextView) findViewById (R.id.ItemName);
        etAmount=(TextView)findViewById(R.id.etAmount);
        etAmount=(TextView)findViewById(R.id.etUnits);
        iBtnImage=(ImageButton)findViewById(R.id.iBtnImage);
        BtnSave=(Button)findViewById(R.id.BtnSave);

//4.
        BtnSave.setOnClickListener(this);


    }

    //2. alt enter
    @Override
    public void onClick(View view) {
        //5
        if (view==BtnSave)
        {
            // reaction
        }


    }
}
