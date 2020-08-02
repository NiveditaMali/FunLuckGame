package com.example.funluckgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText enterednumber;
    Button generate;
    TextView generatednumber;
    int usernumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterednumber=findViewById(R.id.edtxtenterno);
        generate=findViewById(R.id.butgenerate);
        generatednumber=findViewById(R.id.txtrandomno);

        final Random random = new Random();

     generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usernumber= Integer.parseInt(enterednumber.getText().toString());
                int randomNumber = random.nextInt(10);
                generatednumber.setText(String.valueOf(randomNumber));
                //Toast.makeText(MainActivity.this,""+usernumber,Toast.LENGTH_LONG).show();
              if(usernumber==randomNumber){
                    Toast.makeText(MainActivity.this,"Yehh You Won.....",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Try Again....",Toast.LENGTH_LONG).show();
                }


            }
        });



    }
}
