package com.silvericarus.blackjack21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Jugador jugador1 = new Jugador(1000000);
        Banca banca = new Banca();
        Baraja baraja = new Baraja(getDrawable(R.mipmap.dorso_silver_icarus));

        ArrayList<Carta> cartas1 = baraja.getRandomCartas(2);

        Log.i("cartas",cartas1.toString());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
