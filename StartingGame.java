package com.example.cardgamehearts.CardGame;

import java.util.*;
import java.util.List;
import java.util.Scanner;
public class StartingGame {

    public static void  Game(List Player1,List Player2,List Player3,List Player4,String pl1,String pl2,String pl3,String pl4) {
        int currentPlayer;
        Scanner scan=new Scanner(System.in);
        Set<String> r=new LinkedHashSet<>();
        if(Player1.contains("2 ♣️")) {

            r.add("2 ♣️"); currentPlayer=1;
            System.out.println(pl1 + " added 2 ♣️");
            System.out.println("it's "+ pl2 + "'s turn and then "+ pl3 +"'s and "+ pl4+ "'s turn");
        }
        else if(Player2.contains("2 ♣️")) {
            r.add("2 ♣️"); currentPlayer=2;
            System.out.println(pl2 + " added 2 ♣️");
            System.out.println("it's "+ pl3 + "'s turn and then "+ pl4 +"'s and "+ pl1+ "'s turn");
        }
        else if(Player3.contains("2 ♣️")) {
            r.add("2 ♣️"); currentPlayer=3;
            System.out.println(pl3 + " added 2 ♣️");
            System.out.println("it's "+ pl4 + "'s turn and then "+ pl1 +"'s and "+ pl2+ "'s turn");
        }
        else  {
            r.add("2 ♣️"); currentPlayer=4;
            System.out.println(pl4 + " added 2 ♣️");
            System.out.println("its "+ pl1 + " 's turn and then "+ pl2 +"'s and "+ pl3+ "'s turn");
        }
        List players[] = new List[] {Player1, Player2, Player3,Player4};
        players[currentPlayer-1].remove(r);
        currentPlayer+=1;
        for(int i=0; i<4; i++) {
            if(currentPlayer==5) currentPlayer=1;

            List c = players[currentPlayer-1];
            String s= (String) c.remove( players[currentPlayer-1].size()-1);
            currentPlayer+=1;
        }

        r.add(scan.nextLine());
        r.add(scan.nextLine());
        r.add(scan.nextLine());
        //System.out.println(r);

        Set<String> pl1Cards=new LinkedHashSet<>();
        Set<String> pl2Cards=new LinkedHashSet<>();
        Set<String> pl3Cards=new LinkedHashSet<>();
        Set<String> pl4Cards=new LinkedHashSet<>();

        if(Player1.contains(Collections.max(r))) {
            pl1Cards.addAll(r);

        }
        else if(Player2.contains(Collections.max(r))){
            pl2Cards.addAll(r);

        }else if(Player3.contains(Collections.max(r))) {
            pl3Cards.addAll(r);
        }
        else { pl4Cards.addAll(r);

        }


        Player1.removeAll(r);
        Player2.removeAll(r);
        Player3.removeAll(r);
        Player4.removeAll(r);

        System.out.println(pl1Cards);
        System.out.println(pl2Cards);
        System.out.println(pl3Cards);
        System.out.println(pl4Cards);


        System.out.println(Player1);
        System.out.println(Player2);
        System.out.println(Player3);
        System.out.println(Player4);

        r.removeAll(r);
        System.out.println("\n "+ pl1 + " add a card");
        r.add(scan.nextLine());


        System.out.println("\n" +pl2 + " add a card");
        r.add(scan.nextLine());


        System.out.println("\n" +pl3+" add a card");
        r.add(scan.nextLine());

        System.out.println("\n" +pl4 +" add a card");
        r.add(scan.nextLine());

        if(Player1.contains(Collections.max(r))) {
            pl1Cards.addAll(r);

        }
        else if(Player2.contains(Collections.max(r))){
            pl2Cards.addAll(r);

        }else if(Player3.contains(Collections.max(r))) {
            pl3Cards.addAll(r);
        }
        else { pl4Cards.addAll(r);

        }

        Player1.removeAll(r);
        Player2.removeAll(r);
        Player3.removeAll(r);
        Player4.removeAll(r);

        System.out.println(Player1);
        System.out.println(Player2);
        System.out.println(Player3);
        System.out.println(Player4);

        r.removeAll(r);
        System.out.println("\n "+ pl1 + " add a card");
        r.add(scan.nextLine());


        System.out.println("\n" +pl2 + " add a card");
        r.add(scan.nextLine());


        System.out.println("\n" +pl3+" add a card");
        r.add(scan.nextLine());

        System.out.println("\n" +pl4 +" add a card");
        r.add(scan.nextLine());

        if(Player1.contains(Collections.max(r))) {
            pl1Cards.addAll(r);

        }
        else if(Player2.contains(Collections.max(r))){
            pl2Cards.addAll(r);

        }else if(Player3.contains(Collections.max(r))) {
            pl3Cards.addAll(r);
        }
        else { pl4Cards.addAll(r);

        }

        Player1.removeAll(r);
        Player2.removeAll(r);
        Player3.removeAll(r);
        Player4.removeAll(r);

        System.out.println(Player1);
        System.out.println(Player2);
        System.out.println(Player3);
        System.out.println(Player4);

        r.removeAll(r);
        System.out.println("\n "+ pl1 + " add a card");
        r.add(scan.nextLine());


        System.out.println("\n" +pl2 + " add a card");
        r.add(scan.nextLine());


        System.out.println("\n" +pl3+" add a card");
        r.add(scan.nextLine());

        System.out.println("\n" +pl4 +" add a card");
        r.add(scan.nextLine());

        if(Player1.contains(Collections.max(r))) {
            pl1Cards.addAll(r);

        }
        else if(Player2.contains(Collections.max(r))){
            pl2Cards.addAll(r);

        }else if(Player3.contains(Collections.max(r))) {
            pl3Cards.addAll(r);
        }
        else { pl4Cards.addAll(r);

        }

        Player1.removeAll(r);
        Player2.removeAll(r);
        Player3.removeAll(r);
        Player4.removeAll(r);

        System.out.println(Player1);
        System.out.println(Player2);
        System.out.println(Player3);
        System.out.println(Player4);

        r.removeAll(r);
        System.out.println("\n "+ pl1 + " add a card");
        r.add(scan.nextLine());


        System.out.println("\n" +pl2 + " add a card");
        r.add(scan.nextLine());


        System.out.println("\n" +pl3+" add a card");
        r.add(scan.nextLine());

        System.out.println("\n" +pl4 +" add a card");
        r.add(scan.nextLine());

        if(Player1.contains(Collections.max(r))) {
            pl1Cards.addAll(r);

        }
        else if(Player2.contains(Collections.max(r))){
            pl2Cards.addAll(r);

        }else if(Player3.contains(Collections.max(r))) {
            pl3Cards.addAll(r);
        }
        else { pl4Cards.addAll(r);

        }

        Player1.removeAll(r);
        Player2.removeAll(r);
        Player3.removeAll(r);
        Player4.removeAll(r);

        System.out.println(Player1);
        System.out.println(Player2);
        System.out.println(Player3);
        System.out.println(Player4);

        r.removeAll(r);
        System.out.println("\n "+ pl1 + " add a card");
        r.add(scan.nextLine());


        System.out.println("\n" +pl2 + " add a card");
        r.add(scan.nextLine());


        System.out.println("\n" +pl3+" add a card");
        r.add(scan.nextLine());

        System.out.println("\n" +pl4 +" add a card");
        r.add(scan.nextLine());

        if(Player1.contains(Collections.max(r))) {
            pl1Cards.addAll(r);

        }
        else if(Player2.contains(Collections.max(r))){
            pl2Cards.addAll(r);

        }else if(Player3.contains(Collections.max(r))) {
            pl3Cards.addAll(r);
        }
        else { pl4Cards.addAll(r);

        }

        Player1.removeAll(r);
        Player2.removeAll(r);
        Player3.removeAll(r);
        Player4.removeAll(r);

        System.out.println(Player1);
        System.out.println(Player2);
        System.out.println(Player3);
        System.out.println(Player4);

        r.removeAll(r);
        System.out.println("\n "+ pl1 + " add a card");
        r.add(scan.nextLine());


        System.out.println("\n" +pl2 + " add a card");
        r.add(scan.nextLine());


        System.out.println("\n" +pl3+" add a card");
        r.add(scan.nextLine());

        System.out.println("\n" +pl4 +" add a card");
        r.add(scan.nextLine());

        if(Player1.contains(Collections.max(r))) {
            pl1Cards.addAll(r);

        }
        else if(Player2.contains(Collections.max(r))){
            pl2Cards.addAll(r);

        }else if(Player3.contains(Collections.max(r))) {
            pl3Cards.addAll(r);
        }
        else { pl4Cards.addAll(r);

        }

        Player1.removeAll(r);
        Player2.removeAll(r);
        Player3.removeAll(r);
        Player4.removeAll(r);

        System.out.println(Player1);
        System.out.println(Player2);
        System.out.println(Player3);
        System.out.println(Player4);

        r.removeAll(r);
        System.out.println("\n "+ pl1 + " add a card");
        r.add(scan.nextLine());


        System.out.println("\n" +pl2 + " add a card");
        r.add(scan.nextLine());


        System.out.println("\n" +pl3+" add a card");
        r.add(scan.nextLine());

        System.out.println("\n" +pl4 +" add a card");
        r.add(scan.nextLine());

        if(Player1.contains(Collections.max(r))) {
            pl1Cards.addAll(r);

        }
        else if(Player2.contains(Collections.max(r))){
            pl2Cards.addAll(r);

        }else if(Player3.contains(Collections.max(r))) {
            pl3Cards.addAll(r);
        }
        else { pl4Cards.addAll(r);

        }

        Player1.removeAll(r);
        Player2.removeAll(r);
        Player3.removeAll(r);
        Player4.removeAll(r);

        System.out.println(Player1);
        System.out.println(Player2);
        System.out.println(Player3);
        System.out.println(Player4);

        r.removeAll(r);
        System.out.println("\n "+ pl1 + " add a card");
        r.add(scan.nextLine());


        System.out.println("\n" +pl2 + " add a card");
        r.add(scan.nextLine());


        System.out.println("\n" +pl3+" add a card");
        r.add(scan.nextLine());

        System.out.println("\n" +pl4 +" add a card");
        r.add(scan.nextLine());

        if(Player1.contains(Collections.max(r))) {
            pl1Cards.addAll(r);

        }
        else if(Player2.contains(Collections.max(r))){
            pl2Cards.addAll(r);

        }else if(Player3.contains(Collections.max(r))) {
            pl3Cards.addAll(r);
        }
        else { pl4Cards.addAll(r);

        }

        Player1.removeAll(r);
        Player2.removeAll(r);
        Player3.removeAll(r);
        Player4.removeAll(r);

        System.out.println(Player1);
        System.out.println(Player2);
        System.out.println(Player3);
        System.out.println(Player4);

        r.removeAll(r);
        System.out.println("\n "+ pl1 + " add a card");
        r.add(scan.nextLine());


        System.out.println("\n" +pl2 + " add a card");
        r.add(scan.nextLine());


        System.out.println("\n" +pl3+" add a card");
        r.add(scan.nextLine());

        System.out.println("\n" +pl4 +" add a card");
        r.add(scan.nextLine());

        if(Player1.contains(Collections.max(r))) {
            pl1Cards.addAll(r);

        }
        else if(Player2.contains(Collections.max(r))){
            pl2Cards.addAll(r);

        }else if(Player3.contains(Collections.max(r))) {
            pl3Cards.addAll(r);
        }
        else { pl4Cards.addAll(r);

        }

        Player1.removeAll(r);
        Player2.removeAll(r);
        Player3.removeAll(r);
        Player4.removeAll(r);

        System.out.println(Player1);
        System.out.println(Player2);
        System.out.println(Player3);
        System.out.println(Player4);

        r.removeAll(r);
        System.out.println("\n "+ pl1 + " add a card");
        r.add(scan.nextLine());


        System.out.println("\n" +pl2 + " add a card");
        r.add(scan.nextLine());


        System.out.println("\n" +pl3+" add a card");
        r.add(scan.nextLine());

        System.out.println("\n" +pl4 +" add a card");
        r.add(scan.nextLine());

        if(Player1.contains(Collections.max(r))) {
            pl1Cards.addAll(r);

        }
        else if(Player2.contains(Collections.max(r))){
            pl2Cards.addAll(r);

        }else if(Player3.contains(Collections.max(r))) {
            pl3Cards.addAll(r);
        }
        else { pl4Cards.addAll(r);

        }

        Player1.removeAll(r);
        Player2.removeAll(r);
        Player3.removeAll(r);
        Player4.removeAll(r);

        System.out.println(Player1);
        System.out.println(Player2);
        System.out.println(Player3);
        System.out.println(Player4);

        r.removeAll(r);
        System.out.println("\n "+ pl1 + " add a card");
        r.add(scan.nextLine());


        System.out.println("\n" +pl2 + " add a card");
        r.add(scan.nextLine());


        System.out.println("\n" +pl3+" add a card");
        r.add(scan.nextLine());

        System.out.println("\n" +pl4 +" add a card");
        r.add(scan.nextLine());

        if(Player1.contains(Collections.max(r))) {
            pl1Cards.addAll(r);

        }
        else if(Player2.contains(Collections.max(r))){
            pl2Cards.addAll(r);

        }else if(Player3.contains(Collections.max(r))) {
            pl3Cards.addAll(r);
        }
        else { pl4Cards.addAll(r);

        }

        Player1.removeAll(r);
        Player2.removeAll(r);
        Player3.removeAll(r);
        Player4.removeAll(r);

        System.out.println(Player1);
        System.out.println(Player2);
        System.out.println(Player3);
        System.out.println(Player4);

        r.removeAll(r);
        System.out.println("\n "+ pl1 + " add a card");
        r.add(scan.nextLine());


        System.out.println("\n" +pl2 + " add a card");
        r.add(scan.nextLine());


        System.out.println("\n" +pl3+" add a card");
        r.add(scan.nextLine());

        System.out.println("\n" +pl4 +" add a card");
        r.add(scan.nextLine());

        if(Player1.contains(Collections.max(r))) {
            pl1Cards.addAll(r);

        }
        else if(Player2.contains(Collections.max(r))){
            pl2Cards.addAll(r);

        }else if(Player3.contains(Collections.max(r))) {
            pl3Cards.addAll(r);
        }
        else { pl4Cards.addAll(r);

        }

        Player1.removeAll(r);
        Player2.removeAll(r);
        Player3.removeAll(r);
        Player4.removeAll(r);

        System.out.println(Player1);
        System.out.println(Player2);
        System.out.println(Player3);
        System.out.println(Player4);

        System.out.println("Player that has the highest score is the looser");
        System.out.println(pl1 + " score "+ (pl1Cards.size()-1));
        System.out.println(pl2 + " score "+(pl2Cards.size()));
        System.out.println(pl3 + " score "+(pl3Cards.size()));
        System.out.println(pl4 + " score "+(pl4Cards.size()-1));
    }}


