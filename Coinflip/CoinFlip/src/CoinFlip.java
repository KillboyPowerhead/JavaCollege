

/*
Part 1: you'll build on the CoinFlip.java program. The coin simulation asked you to flip a coin 1000 times and report the outcomes. For Lab 1, you should create a class called DiceSim.java (or similar), which simulates the rolling of five six-sided dice 7,776 times and reports the number of Yahtzees (five of a kind) rolled.

You'll either need to use a random generator (java.util.Random) or reuse the Math.random() function, but you'll need to tweak it to simulate a die with sides 1..6 in place of a coin with only 0 and 1 as options. Make sure you don't roll any 0's or 7's...

Part2: Now build a 2-dimensional array that is 5x5 and populate it with random rolls like you did above. Once you’ve populated the 2-D array I want you to print the 2-D array to the output screen then print how many Yahtzees exist in each row, how many Yahtzees exist in each column and how many Yahtzees exist on the diagnals. A sample output could look like this

45631

52411

65121

41351

15321

There are 0 row Yahtzees

There are 1 column Yahtzees

There are 1 diagonal Yahtzees



Both part 1 and part 2 should reside in the same program

Submit just the Java source code file (DiceSim.java or similar) from your project's 'src' folder. The file should contain the following lines of comments at the top:

// FileName.java
// by Your Name
// CSCI 1302
// Lab #1
// Date
 */

import java.util.Random;

public class CoinFlip
{
    public static void main(String[] args){
        Coin myCoin = new Coin();
        Random random = new Random();
       
        int rolling=0;
       Die[] dice = new Die[5];
       int roll = random.nextInt(6)+1;

        int i;
      while(rolling<5)
      {
          for( i = 0; i<dice.length; i++){
                System.out.println(dice[i].Rlll());
                if(i/5==0){
                    System.out.println("Yahtzee");

                }

        }

          System.out.println();

          rolling++;

        }


          /*
        for(int i = 0; i<5; i++){
            while(rolling <5)
            {
                System.out.println();
            }
            System.out.print(die.Roll());
        }
*/
       // int dice;
      // dice = random.nextInt(6)+1;
      //  System.out.println(dice);
        myCoin.flip();
        System.out.println(myCoin);

        if (myCoin.isHeads())
            System.out.println("You win.");
        else
            System.out.println("Better luck next time.");
    }
}
