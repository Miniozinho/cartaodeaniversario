package com.example.cartaoaniversario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void feliz(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),"Feliz Aniversário!!!!",Toast.LENGTH_SHORT);
        toast.show();
    }
}
