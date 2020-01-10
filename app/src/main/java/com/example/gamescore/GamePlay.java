
package com.example.gamescore;


import java.util.Date;

public class GamePlay {

    private String name;
    private String game;
    private Date date;
    private int jugadores;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getGame() { return game; }
    public void setGame(String game) { this.game = game; }
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
    public int getJugadores() { return jugadores; }
    public void setJugadores(int jugadores) { this.jugadores = jugadores; }
}