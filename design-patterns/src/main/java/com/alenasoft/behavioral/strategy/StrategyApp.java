package com.alenasoft.behavioral.strategy;

public class StrategyApp {

  public static void main(String[] args) {

    Team team = new Team();
    team.play(0);

    // Tenemos el balon
    team.setGameStrategy(new AttackStrategy());
    team.play(5);

    // Sin balon
    team.setGameStrategy(new DefenseStrategy());
    team.play(8);

    // Medio Ataque
    team.setGameStrategy(new HalfAttackStrategy());
    team.play(1);

    team.setGameStrategy(
        new GameStrategy() {
          @Override
          public void play(int numberOfPlayers) {
            System.out.println("Simula faltas");
          }
        });
    team.play(0);

    //Repliegue de jugadores
    team.setGameStrategy(new RetractionStrategy());
    team.play(10);

     //Jaula de pajaro
    team.setGameStrategy(new BirdCageStrategy());
    team.play(10);

    //Ataque masivo
    team.setGameStrategy(new MassiveAttackStrategy());
    team.play(10);
  }
}
