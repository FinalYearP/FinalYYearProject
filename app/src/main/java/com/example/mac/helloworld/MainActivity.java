package com.example.mac.helloworld;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String mytag = "myapp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(mytag, "OnCreate  Function Call");
        Button start = (Button) findViewById(R.id.startbutton);
        Button close = (Button) findViewById(R.id.closebutton);
        start.setOnClickListener(this);
        close.setOnClickListener(this);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.v(mytag, "OnStart  Function Call");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.v(mytag, "onResume  Function Call");
    }

    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "Activty Pause", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.v(mytag, "onStop  Function Call");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //Log.v(mytag,"onDestroy  Function Call");
        Toast.makeText(getApplicationContext(), "Close  App", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onRestart() {
        super.onRestart();
        //Log.v(mytag,"onRestart  Function Call");
        Toast.makeText(getApplicationContext(), "Welcome back", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.startbutton) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
        if (id == R.id.closebutton) {
            finish();
        }
    }
}
