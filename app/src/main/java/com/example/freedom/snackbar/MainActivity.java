package com.example.freedom.snackbar;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSnackBar = (Button) findViewById(R.id.button_snackbar);
        btnSnackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Yay! It's Snackbar!!", Snackbar.LENGTH_SHORT).show();
            }
        });

        Button btnSnackBarWithAction = (Button) findViewById(R.id.button_snackbar_with_action);
        btnSnackBarWithAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Yay! It's Snackbar with Action!!", Snackbar.LENGTH_SHORT).setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "I've got action from Snackbar!!", Toast.LENGTH_SHORT).show();
                    }
                }).show();
            }
        });
    }
}

