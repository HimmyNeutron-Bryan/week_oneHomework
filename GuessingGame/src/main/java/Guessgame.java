package Guessing

import java.sql.Struct;game

public class Guessgame {
    Player p1;
    Player p2;
    Player p3;
    public void startGame(){
        p1 = new player();
        p2 = new player();
        p3 = new player();
        int guessp1 =0;
        int guessp2 =0;
        int guessp3 =0;

        boolean guessp1 = false;
        boolean guessp2 = false;
        boolean guessp3 = false;
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("in thinking of a number between 0 and 9...");
while(true){
System.out.println("Number to guess is " + targetNumber);
p1.guess();
p2.guess();
p3.guess();
guessp1 = p1.number;
System.out.println("Player one guessed " + guessp1);

guessp2 = p2.number;
System.out.println("Player two guessed " + guessp2);

guessp3 = p3.number;
System.out.println("Player three guessed " + guessp3);

if (guessp1== targetNumber) {
 p1isRight == true;
}
if (guessp2 == targetNumber) {
 p2isright == true;
}
if (guessp3 == targetNumber) {
 p3isright == true;
}
if (plisright || p2isright || p3isright) {
System.out.println("We have a winner!");
        System.out.println("Player one got it right?" + p1isright);
                System.out.println("Player two got it right?" + p2isright);
                        System.out.println("Player three got it right?" +p3isright);
                                System.out.println("Game is over.");
break;
} else {
System.out.println("Players will have bto try again.");
}
}
}
}