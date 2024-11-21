/*
  Name: Raeed
  Project: Chapter 6 Part 2
  Date: 11/9/24
  Date completed: 11/8/24
  Summary: Die Class
 */
import java.util.Random;

public class Die {
    private int sides;
    private int value;

    public Die() {
        sides = 6;
        roll();
        // value = 3;
    }

    public Die(int numSides) {
        sides = numSides;
        roll();
    }

    public void roll() {
        Random generator = new Random();
        value = generator.nextInt(sides) + 1;

    }

    public int getValue() {
        return value;
    }
}