package edu.upc.calculadori;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    int x;
    public MainActivity(){
        x=0;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btnInicioClick(android.view.View v){
        x++;
        Log.d("MYAPP","Han aceptado las condiciones. Veces pulsado el botón="+x);
        Intent intent = new Intent(MainActivity.this, ChildActivity.class);
        //intent.putExtra("nombre","Meri");
        startActivity(intent);
    }
}