package com.alenasoft.behavioral.strategy;

public class MassiveAttackStrategy implements GameStrategy{
    @Override
    public void play(int numberOfPlayers) {
        System.out.println("Ataque masivo con " + numberOfPlayers + " Jugadores");
    }
}
