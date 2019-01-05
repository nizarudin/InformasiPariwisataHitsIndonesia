package com.infopariwisata;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText username, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username= (EditText) findViewById(R.id.username);
        password= (EditText) findViewById(R.id.password);
        btnLogin= (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();

                if (usernameKey.equals("ajtour") && passwordKey.equals("aj121")){
                    Toast.makeText(getApplicationContext(), "Selamat Datang Para AJ Traveller",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, MenuUtamaActivity.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                }else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Periksa Kembali Username atau Password Anda Dengan Benar dan Silahkan Masuk Kembali")
                            .setNegativeButton("Coba Lagi", null).create().show();
                }
            }
        });
    }
}