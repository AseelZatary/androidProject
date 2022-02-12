package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button customerBtn;
    private Button receptionBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        customerBtn=findViewById(R.id.customerbtn);
        //receptionBtn =findViewById(R.id.receptionbtn);

        customerBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                openLoginActivity();
            }
        });
       /** receptionBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                openReceptionLoginActivity();
            }
        });*/
    }
    public void openLoginActivity()
    {
        Intent intent= new Intent(this,CustomerRegisterActivity.class);
        startActivity(intent);
    }
    /**public void openReceptionLoginActivity()
    {
        Intent intent= new Intent(this,ReceptionLoginActivity.class);
        startActivity(intent);
    }*/
}