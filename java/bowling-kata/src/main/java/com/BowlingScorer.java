package com;

/**
 * This class contains a method for calculating the score for one round of bowling.
 * */
public class BowlingScorer {

    /**
     * This method calculates the score for one line of American 10-pin bowling, given a valid sequence of rolls.
     * @param result A valid sequence of rolls
     * @return the score for the sequence of rolls
     */
    public int calculateScore(int[] result){

        return 0;
    }


    /**
     * This method checks if two throws is a spare
     * @param roll1 The first roll of a frame
     * @param roll2 The second roll of a frame
     * @return true if the rolls are a spare
     */
    private boolean isSpare(int roll1, int roll2){
        if(( roll1 +  roll2) == 10){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * This method checks if a throw is a strike
     * @param roll1 The first roll of a frame
     * @return true if the roll is a strike
     */
    private boolean isStrike(int roll1){
        if(roll1 == 10){
            return true;
        }
        else{
            return false;
        }
    }
}
