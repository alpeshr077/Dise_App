package com.alpesh1.dise_app;

import static com.alpesh1.dise_app.R.drawable.dise_1;
import static com.alpesh1.dise_app.R.drawable.dise_2;
import static com.alpesh1.dise_app.R.drawable.dise_3;
import static com.alpesh1.dise_app.R.drawable.dise_4;
import static com.alpesh1.dise_app.R.drawable.dise_5;
import static com.alpesh1.dise_app.R.drawable.dise_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    int imgs[] = {dise_1,dise_2,dise_3,dise_4,dise_5,dise_6};

    ImageView ImageClick;
    Button Button;
    TextView TextValue;
    CardView CardImage;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageClick = findViewById(R.id.ImageClick);
        TextValue = findViewById(R.id.TextValue);
        CardImage = findViewById(R.id.CardImage);
        Button = findViewById(R.id.Button);

        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int num = random.nextInt(6);
                setDise(num);
            }

            private void setDise(int num) {

                ImageClick.setImageResource(imgs[num]);
                TextValue.setText("Current Value :"+(num+1));
            }
        });
    }
}