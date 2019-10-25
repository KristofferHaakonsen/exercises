package com;

/**
 * This class contains a method for calculating the score for one round of bowling.
 * */
public class BowlingScorer {

    private int[] listOfRolls = new int[21];
    private int rolls = 0;


    /**
     * This method calculates the score for one line of American 10-pin bowling, given a valid sequence of rolls.
     * @return the score for the sequence of rolls
     */
    public int calculateScore(){
        //Keeps the accumulated score
        int score = 0;

        //Indicates which roll we are evaluating
        int currentRoll = 0;

        //Iterate over the frames
        for(int i = 0; i < 10; i++){
            //Check if the frame is a strike
            if(isStrike(listOfRolls[currentRoll])){
               score += 10 + listOfRolls[currentRoll+1] + listOfRolls[currentRoll+2];
               currentRoll++;
            }
            //Check if the frame is a strike
            else if (isSpare(listOfRolls[currentRoll], listOfRolls[currentRoll+1])){
                score += 10 + listOfRolls[currentRoll+2];
                currentRoll = currentRoll + 2;
            }
            //It is a normal frame
            else{
                score += listOfRolls[currentRoll] + listOfRolls[currentRoll+1];
                currentRoll = currentRoll + 2;
            }
        }
        return score;
    }

    /**
     * This method stores a roll of bowling
     * @param roll The amount of pins knocked down in this roll
     */
    public void rollOnce(int roll){
        listOfRolls[rolls] = roll;
        rolls++;
    }


    /**
     * This method checks if two rolls is a spare
     * @param roll1 The first roll of a frame
     * @param roll2 The second roll of a frame
     * @return true if the rolls are a spare
     */
    private boolean isSpare(int roll1, int roll2){
        return( (roll1 +  roll2) == 10);
    }

    /**
     * This method checks if a roll is a strike
     * @param roll1 The first roll of a frame
     * @return true if the roll is a strike
     */
    private boolean isStrike(int roll1) {
        return (roll1 == 10);
    }
}
