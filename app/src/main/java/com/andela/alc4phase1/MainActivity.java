package com.andela.alc4phase1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void aboutButtonClick(View view) {
        startActivity(new Intent(this, AboutALCActivity.class));
    }

    public void profileButtonClick(View view) {
        startActivity(new Intent(this, MyProfileActivity.class));
    }
}
