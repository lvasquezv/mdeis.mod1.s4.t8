package com.alenasoft.behavioral.strategy;

public class RetractionStrategy implements GameStrategy {
    @Override
    public void play(int numberOfPlayers) {
        System.out.println("Repliegue con " + numberOfPlayers + " jugadores");
    }
}
