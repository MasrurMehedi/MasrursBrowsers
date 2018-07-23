package com.example.masror_mehedi.masrursbrowser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnGo,btnFB,btnGoogle,btnYouTube,btnEspn,btnGmail,btnTwitter ,btnPortfolio;

    EditText etxtURL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnGo = findViewById(R.id.btn_go);
        btnFB =findViewById(R.id.btn_fb);
        btnGoogle = findViewById(R.id.btn_google);
        etxtURL= findViewById(R.id.etxt_url);
        btnYouTube = findViewById(R.id.btn_you_tube);
        btnEspn = findViewById(R.id.btn_espn);
        btnGmail = findViewById(R.id.btn_gmail);
        btnTwitter = findViewById(R.id.btn_twitter);
        btnPortfolio=findViewById(R.id.btn_portfolio);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = etxtURL.getText().toString();
                if (url.isEmpty())
                {

                    Toast.makeText(MainActivity.this,"please enter URL!",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Intent intent = new Intent(MainActivity.this,WebActivity.class);
                    intent.putExtra("url",url);
                    startActivity(intent);
                }
            }

        });

        btnFB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("url","www.facebook.com");
                startActivity(intent);
            }
        });


        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("url","www.google.com");
                startActivity(intent);
            }
        });

        btnYouTube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("url","www.youtube.com");
                startActivity(intent);
            }
        });
        btnEspn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("url","www.espn.com");
                startActivity(intent);
            }
        });
        btnGmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("url","www.gmail.com");
                startActivity(intent);
            }
        });
        btnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("url","www.twitter.com");
                startActivity(intent);
            }
        });
        btnPortfolio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("url","masror.azurewebsites.net");
                startActivity(intent);
            }
        });
    }
}
