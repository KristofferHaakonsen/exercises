package com;

/**
 * Represents one round of American 10-pin bowling
 */
public class BowlingGame {

    //The BowlingScorer used for the calculations
    private BowlingScorer scorer= new BowlingScorer();

    //Holds the rolls
    private int[] listOfRolls = new int[21];

    //Is used to put the next roll at the correct place
    private int rolls = 0;


    /**
     * This method stores a roll of bowling
     * @param roll The amount of pins knocked down in this roll
     */
    public void rollOnce(int roll){
        listOfRolls[rolls] = roll;
        rolls++;
    }

    /**
     * This method returns the calculated score for the rolls
     * @return The score
     */
    public int getScore(){
       return scorer.calculateScore(listOfRolls);
    }

    /**
     * This method returns the array of rolls
     * @return The rolls
     */
    public int[] getArrayOfRolls(){
        return listOfRolls;
    }


}
