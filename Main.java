/*
Mini Project 1
Group 9: Joey DeSantis, Nicholas Natale, Milan Patel, Alex Helm
Date: 2/17/21
*/

import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Random r = new Random();

    System.out.println("Welcome to the guessing game!");
    System.out.println("Please enter any positive whole number: ");

    int userNum = s.nextInt();
    int randomNum = r.nextInt(userNum);

    System.out.println("A random number to guess has been generated");

    playGame(userNum, randomNum);
  }

  static void playGame(int theUserNum, int theRandomNum) {
    System.out.println("Please guess a number between 0 and " + theUserNum);
    Scanner i = new Scanner(System.in);
    int numTries = 0;
    boolean win = false;

    while (win == false) {
      int userGuess = i.nextInt();
      numTries++;

      if (userGuess > theRandomNum) {
        System.out.println("Guess lower!");
        System.out.println("Enter your new guess: ");
      }
      else if (userGuess < theRandomNum) {
        System.out.println("Guess higher!");
        System.out.println("Enter your new guess: ");
      }
      else if (userGuess == theRandomNum) {
        win = true;
        System.out.println("Great, you win! It took you " + numTries + " tries");
      }
    }
  }
}