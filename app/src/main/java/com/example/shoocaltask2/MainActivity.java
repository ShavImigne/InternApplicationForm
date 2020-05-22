package com.example.shoocaltask2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private LinearLayout Linlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Linlayout = (LinearLayout) findViewById(R.id.Linearlayout1);
        LayoutInflater layoutInflater = getLayoutInflater();
        final ConstraintLayout view = (ConstraintLayout) layoutInflater.inflate(R.layout.inflate2, Linlayout, false);
        Linlayout.addView(view);
        final ConstraintLayout Submit = (ConstraintLayout) layoutInflater.inflate(R.layout.submit,Linlayout,false);
        Linlayout.addView(Submit);
    }
    public void Onclick(View v){
        count++;
        View x = findViewById(R.id.SubmitForm);
        Linlayout.removeView((View) x.getParent());
        LayoutInflater layoutInflater = getLayoutInflater();
        final ConstraintLayout view = (ConstraintLayout) layoutInflater.inflate(R.layout.inflate2,Linlayout,false);
        Linlayout.addView(view);
        final ConstraintLayout Submit = (ConstraintLayout) layoutInflater.inflate(R.layout.submit,Linlayout,false);
        Linlayout.addView(Submit);
    }
    public void OnRemove(View v){
        if(count==0){
            Toast.makeText(getApplicationContext(), "You need to know atleast one language!", Toast.LENGTH_SHORT).show();
        }
        else {
            Linlayout.removeView((View) v.getParent().getParent());
            count--;
        }
    }
}
