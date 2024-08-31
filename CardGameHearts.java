package com.example.cardgamehearts.CardGame;
import java.util.*;

public class CardGameHearts {
    public static void main(String[] args) {
        ArrayList<String> kartat=new ArrayList<>();
        kartat.add( "Ace ♠️");
        kartat.add( "2 ♠️");
        kartat.add( "3 ♠️");
        kartat.add( "4 ♠️");
        kartat.add( "5 ♠️");
        kartat.add( "6 ♠️");
        kartat.add( "7 ♠️");
        kartat.add( "8 ♠️");
        kartat.add( "9 ♠️");
        kartat.add( "10 ♠️");
        kartat.add( "Jack ♠️");
        kartat.add( "Queen ♠️");
        kartat.add( "King ♠️");
        kartat.add( "Ace ♥️");
        kartat.add( "2 ♥️");
        kartat.add( "3 ♥️");
        kartat.add( "4 ♥️");
        kartat.add( "5 ♥️");
        kartat.add( "6 ♥️");
        kartat.add( "7 ♥️");
        kartat.add( "8 ♥️");
        kartat.add( "9 ♥️");
        kartat.add( "10 ♥️");
        kartat.add( "Jack ♥️");
        kartat.add( "Queen ♥️");
        kartat.add( "King ♥️");
        kartat.add( "Ace ♦️");
        kartat.add( "2 ♦️");
        kartat.add( "3 ♦️");
        kartat.add( "4 ♦️");
        kartat.add( "5 ♦️");
        kartat.add( "6 ♦️");
        kartat.add( "7 ♦️");
        kartat.add( "8 ♦️");
        kartat.add( "9 ♦️");
        kartat.add( "10 ♦️");
        kartat.add( "Jack ♦️");
        kartat.add( "Queen ♦️");
        kartat.add( "King ♦️");
        kartat.add( "Ace ♣️");
        kartat.add( "2 ♣️");
        kartat.add( "3 ♣️");
        kartat.add( "4 ♣️");
        kartat.add( "5 ♣️");
        kartat.add( "6 ♣️");
        kartat.add( "7 ♣️");
        kartat.add( "8 ♣️");
        kartat.add( "9 ♣️");
        kartat.add( "10 ♣️");
        kartat.add( "Jack ♣️");
        kartat.add( "Queen ♣️");
        kartat.add( "King ♣️");
        Collections.shuffle(kartat);
        PlayersClass l=new PlayersClass();

        List Player1=new ArrayList<String>();
        List Player2=new ArrayList<String>();
        List Player3=new ArrayList<String>();
        List Player4=new ArrayList<String>();
        l.Players(kartat,Player1,Player2,Player3,Player4);


    }
}
