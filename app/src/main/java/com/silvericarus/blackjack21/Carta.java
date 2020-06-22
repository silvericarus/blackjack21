package com.silvericarus.blackjack21;

import java.util.ArrayList;

public class Carta {
    ArrayList<Integer> valor;
    boolean volteada;

    public Carta(ArrayList<Integer> valor, boolean volteada) {
        this.valor = valor;
        this.volteada = volteada;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "valor=" + valor +
                '}';
    }
}
