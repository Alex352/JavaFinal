package thefinal;

public class DiceGame {
		// TODO Auto-generated method stub
	private static int die1;   // Number showing on the first die.
    private static int die2;   // Number showing on the second die.
    private static int total;
	
		// TODO Auto-generated method stub
	 public static void DiceGame() {
         // Constructor.  Rolls the dice, so that they initially
         // show some random values.
     roll();  // Call the roll() method to roll the dice.
 }
 
 public static void roll() {
         // Roll the dice by setting each of the dice to be
         // a random number between 1 and 6.
     die1 = (int)(Math.random()*6) + 1;
     die2 = (int)(Math.random()*6) + 1;
     total = die1 + die2;
     System.out.println("Dice One was " + die1);
     System.out.println("Dice Two was " + die2);
     System.out.println("The total of the dice was " + total);
 }

}
	                 

