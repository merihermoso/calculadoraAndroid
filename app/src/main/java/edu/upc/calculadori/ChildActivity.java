package edu.upc.calculadori;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {
    TextView resultado_text;
    double n1,n2,res;
    String Operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
    }

     public void btn0Click(View view) {
         Log.d("MYAPP","Han pulsado 0");
        resultado_text=(TextView)findViewById(R.id.resultado);
        resultado_text.setText(resultado_text.getText()+"0");
    }
    public void btn1Click(View view) {
        Log.d("MYAPP","Han pulsado 1");
        resultado_text=(TextView)findViewById(R.id.resultado);
        resultado_text.setText(resultado_text.getText()+"1");
    }
    public void btn2Click(View view) {
        Log.d("MYAPP","Han pulsado 2");
        resultado_text=(TextView)findViewById(R.id.resultado);
        resultado_text.setText(resultado_text.getText()+"2");
    }
    public void btn3Click(View view) {
        Log.d("MYAPP","Han pulsado 3");
        resultado_text=(TextView)findViewById(R.id.resultado);
        resultado_text.setText(resultado_text.getText()+"3");
    }
    public void btn4Click(View view) {
        Log.d("MYAPP","Han pulsado 4");
        resultado_text=(TextView)findViewById(R.id.resultado);
        resultado_text.setText(resultado_text.getText()+"4");
    }
    public void btn5Click(View view) {
        Log.d("MYAPP","Han pulsado 5");
        resultado_text=(TextView)findViewById(R.id.resultado);
        resultado_text.setText(resultado_text.getText()+"5");
    }
    public void btn6Click(View view) {
        Log.d("MYAPP","Han pulsado 6");
        resultado_text=(TextView)findViewById(R.id.resultado);
        resultado_text.setText(resultado_text.getText()+"6");
    }
    public void btn7Click(View view) {
        Log.d("MYAPP","Han pulsado 7");
        resultado_text=(TextView)findViewById(R.id.resultado);
        resultado_text.setText(resultado_text.getText()+"7");
    }
    public void btn8Click(View view) {
        Log.d("MYAPP","Han pulsado 8");
        resultado_text=(TextView)findViewById(R.id.resultado);
        resultado_text.setText(resultado_text.getText()+"8");
    }
    public void btn9Click(View view) {
        Log.d("MYAPP","Han pulsado 9");
        resultado_text=(TextView)findViewById(R.id.resultado);
        resultado_text.setText(resultado_text.getText()+"9");
    }
    public void puntoClick(View view) {
        Log.d("MYAPP","Han pulsado el punto");
        resultado_text=(TextView)findViewById(R.id.resultado);
        resultado_text.setText(resultado_text.getText()+".");
    }
    public void OperacionPrimerNumero(View view) {
        resultado_text=(TextView)findViewById(R.id.resultado);
        n1=Double.parseDouble(resultado_text.getText().toString());
        resultado_text.setText("");
    }
    public void btnSumClick(View view) {
        Log.d("MYAPP","Han pulsado +");
        Operador="+";
        OperacionPrimerNumero(view);
    }
    public void btnRestClick(View view) {
        Log.d("MYAPP","Han pulsado -");
        Operador="-";
        OperacionPrimerNumero(view);
    }
    public void btnMultClick(View view) {
        Log.d("MYAPP","Han pulsado *");
        Operador="*";
        OperacionPrimerNumero(view);
    }
    public void btnDivClick(View view) {
        Log.d("MYAPP","Han pulsado /");
        Operador="/";
        OperacionPrimerNumero(view);
    }
    public void btnIgualClick(View view) {
        Log.d("MYAPP","Han pulsado =");
        resultado_text=(TextView)findViewById(R.id.resultado);
        n2=Double.parseDouble(resultado_text.getText().toString());
        if(Operador.equals("+")){
            res=n1+n2;
        }else if(Operador.equals("-")){
            res=n1-n2;
        }else if(Operador.equals("*")){
            res=n1*n2;
        }else if(Operador.equals("/")) {
            res = n1 / n2;
        }
        resultado_text.setText(""+res);
    }
    public void btnSinClick(View view) {
        resultado_text=(TextView)findViewById(R.id.resultado);
        try{
            n1=Double.parseDouble(resultado_text.getText().toString());
            double rd=Math.toRadians(n1);
            res=Math.sin(rd);
            resultado_text.setText(String.valueOf(res));
        }catch (NumberFormatException NFE){}
    }
    public void btnCosClick(View view) {
        resultado_text=(TextView)findViewById(R.id.resultado);
        try{
            n1=Double.parseDouble(resultado_text.getText().toString());
            double rd=Math.toRadians(n1);
            res=Math.cos(rd);
            resultado_text.setText(String.valueOf(res));
        }catch (NumberFormatException NFE){}
    }
    public void btnTanClick(View view) {
        resultado_text=(TextView)findViewById(R.id.resultado);
        try{
            n1=Double.parseDouble(resultado_text.getText().toString());
            double rd=Math.toRadians(n1);
            res=Math.tan(rd);
            resultado_text.setText(String.valueOf(res));
        }catch (NumberFormatException NFE){}
    }
    public void btnClearClick(View view) {
        n1=0.0;
        n2=0.0;
        resultado_text=(TextView)findViewById(R.id.resultado);
        resultado_text.setText("");
    }

}