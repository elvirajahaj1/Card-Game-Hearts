package com.example.cardgamehearts.CardGame;
import java.util.*;

public class PlayersClass{
    List<String> Player1;
    List<String> Player2;
    List<String> Player3;
    List<String> Player4;

    public static void Players(ArrayList<String> cards,List Player1,List Player2,List Player3,List Player4) {
        Scanner scan=new Scanner(System.in);
        Player1=new ArrayList<>();
        Player2=new ArrayList<>();
        Player3=new ArrayList<>();
        Player4=new ArrayList<>();
        System.out.println("Card Game : Hearts");
        System.out.println("Enter your name:");
        String s=scan.nextLine();
        System.out.println(s+ "'s  cards:");
        for(int i=0;i<13;i++) {
            Player1.add(cards.get(i));
        }System.out.print(Player1);
        System.out.println("\nEnter your name:");
        String p=scan.nextLine();
        System.out.println(p +  "'s cards:");
        for(int j=13;j<26;j++) {
            Player2.add(cards.get(j));

        } System.out.println(Player2);
        System.out.println("\nEnter your name:");
        String e=scan.nextLine();
        System.out.println(e +  "'s cards:");
        for(int j=26;j<39;j++) {
            Player3.add(cards.get(j));

        } System.out.println(Player3);
        System.out.println("\nEnter your name:");
        String v=scan.nextLine();
        System.out.println(v +  "'s cards:");
        for(int j=39;j<52;j++) {
            Player4.add(cards.get(j));

        } System.out.println(Player4);

        PlayersClass r=new PlayersClass();
        r.Round1(Player1, Player2,Player3,Player4,s,p,e,v);
        r.Round2(Player1, Player2, Player3, Player4, s, p, e,v);
        r.Round3(Player1, Player2, Player3, Player4, s, p, e,v);
        r.Round4(Player1, Player2, Player3, Player4, s, p,e,v);


    }
    public static void Round1(List Player1,List Player2,List Player3,List Player4,String pl1,String pl2,String pl3,String pl4) {
        System.out.println("                                ROUND 1");

        Scanner scan=new Scanner(System.in);

        System.out.println("\n" + pl1 + " you have to pass three cards to "+pl2 );

        List<String> passedCards1=new ArrayList<>();
        passedCards1.add(scan.nextLine());
        passedCards1.add(scan.nextLine());
        passedCards1.add(scan.nextLine());
        Player1.removeAll(passedCards1);

        System.out.println("\n " + pl2 + " you have to pass three cards to  "+ pl3);
        Player2.addAll(passedCards1);
        List<String> passedCards2=new ArrayList<>();
        passedCards2.add(scan.nextLine());
        passedCards2.add(scan.nextLine());
        passedCards2.add(scan.nextLine());
        Player2.removeAll(passedCards2);

        System.out.println("\n" +pl3 + " you have to pass three cards to  "+pl4);
        Player3.addAll(passedCards2);
        List<String> passedCards3=new ArrayList<>();
        passedCards3.add(scan.nextLine());
        passedCards3.add(scan.nextLine());
        passedCards3.add(scan.nextLine());
        Player3.removeAll(passedCards3);

        System.out.println("\n" + pl4 + " you have to pass three cards to  "+ pl1);
        Player4.addAll(passedCards3);
        List<String> passedCards4=new ArrayList<>();
        passedCards4.add(scan.nextLine());
        passedCards4.add(scan.nextLine());
        passedCards4.add(scan.nextLine());
        Player4.removeAll(passedCards4);

        Player1.addAll(passedCards4);
        System.out.println(pl1+"'s cards");
        System.out.println(Player1);
        System.out.println(pl2+"'s cards");
        System.out.println(Player2);
        System.out.println(pl3+"'s cards");
        System.out.println(Player3);
        System.out.println(pl4 +"'s cards");
        System.out.println(Player4);

        StartingGame o=new StartingGame();
        o.Game(Player1, Player2, Player3, Player4,pl1,pl2,pl3,pl4);


    }public static void Round2(List Player1,List Player2,List Player3,List Player4,String pl1,String pl2,String pl3,String pl4) {
        System.out.println("                             ROUND 2");
        Scanner scan=new Scanner(System.in);

        System.out.println("\n"+ pl1 +" you have to pass three cards to "+pl4 );

        List<String> passedCards1=new ArrayList<>();
        passedCards1.add(scan.nextLine());
        passedCards1.add(scan.nextLine());
        passedCards1.add(scan.nextLine());
        Player1.removeAll(passedCards1);

        System.out.println("\n" + pl4 + " you have to pass three cards to  "+ pl3);
        Player4.addAll(passedCards1);
        List<String> passedCards4=new ArrayList<>();
        passedCards4.add(scan.nextLine());
        passedCards4.add(scan.nextLine());
        passedCards4.add(scan.nextLine());
        Player4.removeAll(passedCards4);

        System.out.println("\n" + pl3 + " you have to pass three cards to  "+pl2);
        Player3.addAll(passedCards4);
        List<String> passedCards3=new ArrayList<>();
        passedCards3.add(scan.nextLine());
        passedCards3.add(scan.nextLine());
        passedCards3.add(scan.nextLine());
        Player3.removeAll(passedCards3);
        //pl
        System.out.println("\n "+ pl2+ " you have to pass three cards to  "+ pl1);
        Player2.addAll(passedCards3);
        List<String> passedCards2=new ArrayList<>();
        passedCards2.add(scan.nextLine());
        passedCards2.add(scan.nextLine());
        passedCards2.add(scan.nextLine());
        Player2.removeAll(passedCards2);
        Player1.addAll(passedCards2);

        System.out.println(pl1+"'s cards");
        System.out.println(Player1);

        System.out.println(pl2+"'s cards");
        System.out.println(Player2);

        System.out.println(pl3+"'s cards");
        System.out.println(Player3);

        System.out.println(pl4 +"'s cards");
        System.out.println(Player4);

        StartingGame o=new StartingGame();
        o.Game(Player1, Player2, Player3, Player4,pl1,pl2,pl3,pl4);
    }
    public static void Round3(List Player1,List Player2,List Player3,List Player4,String pl1,String pl2,String pl3,String pl4) {
        System.out.println("                                 ROUND 3");
        Scanner scan=new Scanner(System.in);

        System.out.println("\n" + pl1 + " you have to pass three cards to "+pl3 );

        List<String> passedCards1=new ArrayList<>();

        passedCards1.add(scan.nextLine());
        passedCards1.add(scan.nextLine());
        passedCards1.add(scan.nextLine());
        Player1.removeAll(passedCards1);

        System.out.println("\n " + pl3 +" you have to pass three cards to  "+pl1);
        Player3.addAll(passedCards1);
        List<String> passedCards3=new ArrayList<>();
        passedCards3.add(scan.nextLine());
        passedCards3.add(scan.nextLine());
        passedCards3.add(scan.nextLine());
        Player3.removeAll(passedCards3);

        Player1.addAll(passedCards1);

        System.out.println("\n " + pl2 + " you have to pass three cards to  "+ pl4);
        List<String> passedCards2=new ArrayList<>();
        passedCards2.add(scan.nextLine());
        passedCards2.add(scan.nextLine());
        passedCards2.add(scan.nextLine());
        Player2.removeAll(passedCards2);

        System.out.println("\n " +  pl4 +" you have to pass three cards to  "+ pl2);
        Player4.addAll(passedCards2);
        List<String> passedCards4=new ArrayList<>();
        passedCards4.add(scan.nextLine());
        passedCards4.add(scan.nextLine());
        passedCards4.add(scan.nextLine());
        Player4.removeAll(passedCards4);

        Player2.addAll(passedCards4);

        System.out.println(pl1+"'s cards");
        System.out.println(Player1);
        System.out.println(pl2+"'s cards");
        System.out.println(Player2);
        System.out.println(pl3+"'s cards");
        System.out.println(Player3);
        System.out.println(pl4 +"'s cards");
        System.out.println(Player4);

        StartingGame o=new StartingGame();
        o.Game(Player1, Player2, Player3, Player4,pl1,pl2,pl3,pl4);

    }
    public static void Round4(List Player1,List Player2,List Player3,List Player4,String pl1,String pl2,String pl3,String pl4) {
        System.out.println("                              ROUND 4");
        Scanner scan=new Scanner(System.in);

        System.out.println("\n "+ pl1 + " you have to pass three cards to "+pl2 );

        List<String> passedCards1=new ArrayList<>();
        passedCards1.add(scan.nextLine());
        passedCards1.add(scan.nextLine());
        passedCards1.add(scan.nextLine());
        Player1.removeAll(passedCards1);

        Player2.addAll(passedCards1);
        System.out.println("\n "+pl2 + " you have to pass three cards to "+pl1);
        List<String> passedCards2=new ArrayList<>();
        passedCards2.add(scan.nextLine());
        passedCards2.add(scan.nextLine());
        passedCards2.add(scan.nextLine());
        Player2.removeAll(passedCards2);

        Player1.addAll(passedCards2);

        System.out.println("\n "+ pl3+" you have to pass three cards to  "+ pl4);
        List<String> passedCards3=new ArrayList<>();
        passedCards3.add(scan.nextLine());
        passedCards3.add(scan.nextLine());
        passedCards3.add(scan.nextLine());
        Player3.removeAll(passedCards3);

        Player4.addAll(passedCards3);
        System.out.println("\n "+pl4 +" you have to pass three cards to  "+ pl3);
        List<String> passedCards4=new ArrayList<>();
        passedCards4.add(scan.nextLine());
        passedCards4.add(scan.nextLine());
        passedCards4.add(scan.nextLine());
        Player4.removeAll(passedCards4);

        Player3.addAll(passedCards4);

        System.out.println(pl1+"'s cards");
        System.out.println(Player1);
        System.out.println(pl2+"'s cards");
        System.out.println(Player2);
        System.out.println(pl3+"'s cards");
        System.out.println(Player3);
        System.out.println(pl4 +"'s cards");
        System.out.println(Player4);

        StartingGame o=new StartingGame();
        o.Game(Player1, Player2, Player3, Player4,pl1,pl2,pl3,pl4);

    }
}





