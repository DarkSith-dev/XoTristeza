package com.example.xotristeza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    ImageView imvSmile;
    TextView tvNumero;
    Button btFeliz;
    TextView tvZerar;

    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imvSmile = findViewById(R.id.imvSmile);
        tvNumero = findViewById(R.id.tvNumero);
        btFeliz= findViewById(R.id.btFeliz);

        btFeliz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador ++;
                Log.d("TESTE CONTADOR: ", "onClick: Clicou" + contador);
                tvNumero.setText( String.valueOf(contador) );

                switch (contador){

                    case 10:
                        imvSmile.setImageResource(R.drawable.smile02);
                        break;
                    case 20:
                        imvSmile.setImageResource(R.drawable.smile03);
                        break;
                    case 30:
                        imvSmile.setImageResource(R.drawable.smile04);
                        break;
                    case 40:
                        imvSmile.setImageResource(R.drawable.smile05);
                        break;
                    case 50:
                        imvSmile.setImageResource(R.drawable.smile06);
                        break;
                    case 60:
                        imvSmile.setImageResource(R.drawable.smile07);
                        break;
                    case 70:
                        imvSmile.setImageResource(R.drawable.smile08);
                        break;
                    case 80:
                        imvSmile.setImageResource(R.drawable.smile09);
                        break;
                    case 90:
                        imvSmile.setImageResource(R.drawable.smile10);
                        break;
                    case 100:
                        imvSmile.setImageResource(R.drawable.smile11);
                        break;

                }


            }
        });
    }

    public void  zerarTudo(View view){
        contador = 0;
        tvNumero.setText(String.valueOf(contador));
        imvSmile.setImageResource(R.drawable.smile01);
    }
}