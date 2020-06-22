package com.silvericarus.blackjack21;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Baraja {
    Drawable dorso;
    ArrayList<Carta> cartas = new ArrayList<>();

    public Baraja(Drawable dorso) {
        this.dorso = dorso;
        cartas.add(new Carta(new ArrayList<Integer>(Arrays.asList(11, 1)),false));
        for (int i = 1; i < 9; i++) {
            cartas.add(new Carta(new ArrayList<Integer>(Arrays.asList(i+1)),false));
        }
        cartas.add(new Carta(new ArrayList<Integer>(Arrays.asList(10)),false));
        cartas.add(new Carta(new ArrayList<Integer>(Arrays.asList(10)),false));
        cartas.add(new Carta(new ArrayList<Integer>(Arrays.asList(10)),false));
    }

    public ArrayList<Carta> getRandomCartas(int totalItems){
        Random rand = new Random();

        ArrayList<Carta> newList = new ArrayList<>();

        for (int i = 0; i < totalItems; i++) {
            int randomIndex = rand.nextInt(cartas.size());

            newList.add(cartas.get(randomIndex));
        }
        return newList;
    }
}
