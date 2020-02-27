package com.example.fragementtask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.b1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setVisibility(v.INVISIBLE);
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                Fragement1 fragement1 = new Fragement1();
                ft.replace(R.id.f1,fragement1);
                ft.commit();

            }
        });

    }
}
