package com.alenasoft.behavioral.strategy;

public class BirdCageStrategy implements GameStrategy{
    @Override
    public void play(int numberOfPlayers) {
        System.out.println("Jaula de pajaro con " + numberOfPlayers + " jugadores");
    }
}
