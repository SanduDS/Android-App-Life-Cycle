package com.example.sandusandu.lifecycledemonstration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "InOnCreate", Toast.LENGTH_SHORT).show();
        Log.i("Info", "In  onCreate: ");
        
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"In OnStrat",Toast.LENGTH_SHORT).show();
        Log.i("Info", "In  onCreate: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"In OnResume",Toast.LENGTH_SHORT).show();
        Log.i("Info","In OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"In OnPause",Toast.LENGTH_SHORT).show();
        Log.i("Info", "In  onPause: ");


    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"In OnStop",Toast.LENGTH_SHORT).show();
        Log.i("Info", "In  onStop: ");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"In Destroy",Toast.LENGTH_SHORT).show();
        Log.i("Info", "In  onDestroy: ");
    }
}
