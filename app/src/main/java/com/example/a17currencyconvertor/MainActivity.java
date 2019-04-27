package com.example.a17currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    Button euro,pound,dollar,yen,candollar,ausdollar,dinar,btc,rubel;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro= findViewById(R.id.euro);
        pound=findViewById(R.id.pound);
        dollar= findViewById(R.id.dollar);
        yen= findViewById(R.id.yen);
        candollar=findViewById(R.id.candollar);
        ausdollar=findViewById(R.id.ausdollar);
        dinar=findViewById(R.id.dinar);
        btc=findViewById(R.id.btc);
        rubel= findViewById(R.id.rubel);
        editText=findViewById(R.id.editText);
        textView=findViewById(R.id.textView);

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z= editText.getText().toString();

                if(TextUtils.isEmpty(z)) {
                    editText.setError("Empty user input");
                    }
                else
                {
                    double n,k;

                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter= new Formatter();
                    k=n * 0.013;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k) );
                }
            }
        });
        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = editText.getText().toString();

                if (TextUtils.isEmpty(x))
                {
                    editText.setError("Empty user input");

                }
                else {

                    double a, b;
                a=Double.parseDouble(x);
                textView.setText(null);
                Formatter formatter= new Formatter();
                b=a*0.014;
                DecimalFormat numberFormat = new DecimalFormat("#.00");
                textView.setText(""+numberFormat.format(b));


                }
            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String y= editText.getText().toString();
               if(TextUtils.isEmpty(y))
               {
                   editText.setError("Empty user input");

               }
               else
               {
                   double f,g;

                   f=Double.parseDouble(y);
                   textView.setText(null);
                   Formatter formatter= new Formatter();
                   g=f*0.011;
                   DecimalFormat numberFormat = new DecimalFormat("#.00");
                   textView.setText(""+numberFormat.format(g));

               }

            }
        });
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e=editText.getText().toString();

                if(TextUtils.isEmpty(e))
                {
                    editText.setError("Empty user input");

                }
                else
                {
                    double s,t;

                    s=Double.parseDouble(e);
                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    t=s*1.61;

                    DecimalFormat decimalFormat= new DecimalFormat("#.00");

                    textView.setText(""+decimalFormat.format(t));


                }

            }
        });

        candollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c= editText.getText().toString();

                if(TextUtils.isEmpty(c))
                {
                    editText.setError("Empty user ");
                    textView.setText(null);
                }
                    else
                {
                    double t,u;
                    t=Double.parseDouble(c);
                    Formatter formatter= new Formatter();
                    u=t*0.019;
                    DecimalFormat decimalFormat= new DecimalFormat("#0.0");
                    textView.setText(""+decimalFormat.format(u));

                }

            }

        });

        ausdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a= editText.getText().toString();

                if(TextUtils.isEmpty(a))
                {
                    editText.setError("Empty user input");
                    textView.setText(null);

                }
                else
                {
                    double u,s;
                    u=Double.parseDouble(a);
                    Formatter formatter= new Formatter();
                    s=u*0.020;
                    DecimalFormat decimalFormat= new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(s));


                }
            }
        });

        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String di= editText.getText().toString();

                if(TextUtils.isEmpty(di))
                {
                    editText.setError("Empty user input");
                    textView.setText(null);

                }
                else
                {
                    double n,a;
                    n=Double.parseDouble(di);
                    Formatter formatter= new Formatter();
                    a=n*0.0044;
                     DecimalFormat decimalFormat= new DecimalFormat("#.00");

                     textView.setText(""+decimalFormat.format(a));
                }
            }
        });

        btc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b= editText.getText().toString();
                if(TextUtils.isEmpty(b))
                {
                    editText.setError("Empty user input");
                    textView.setText(null);
                }
                else
                {

                    double t,c;
                    t=Double.parseDouble(b);
                    Formatter formatter= new Formatter();
                    c=t*0.0027;
                    DecimalFormat decimalFormat= new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(c));



                }
            }

        });

        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String r= editText.getText().toString();
                if(TextUtils.isEmpty(r))
                {
                    editText.setError("Empty user input");
                    textView.setText(null);


                }
                else
                {
                    double u,b;
                    u=Double.parseDouble(r);
                    Formatter formatter= new Formatter();
                    b=u*0.92;
                    DecimalFormat format=new DecimalFormat("#.00");
                    textView.setText(""+format.format(b));

                }
            }
        });




    }
}
