package com;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


/**
 * This class tests the BowlingGames methods
 * */
public class BowlingGameTest {

    BowlingGame game;

    //Test rolls
    private int[] nineAndZeroRolls = {9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0};
    private int[] strikeRolls = {10,10,10,10,10,10,10,10,10,10,10,10};

    @Before
    public void init(){
        game = new BowlingGame();
    }

    /**
     * Tests that we can add rolls to the array
     */
    @Test
    public void addSequenceOfRolls(){
        for(int i : nineAndZeroRolls){
            game.rollOnce(i);
        }
        int[] expectedResult = {9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,0};
        assertArrayEquals(expectedResult, game.getArrayOfRolls());
    }


    /**
     * Tests that we can add all strikes to the array
     */
    @Test
    public void addSequenceOfRollsStrikes(){
        for(int i : strikeRolls){
            game.rollOnce(i);
        }
        int[] expectedResult = {10,10,10,10,10,10,10,10,10,10,10,10,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(expectedResult, game.getArrayOfRolls());
    }

    /**
     * Tests that we can get the correct result of all strikes
     */
    @Test
    public void addAndCalculateScoreStrike(){
        for(int i : strikeRolls){
            game.rollOnce(i);
        }
        assertEquals(300, game.getScore());
    }


    /**
     * Tests that we can get the correct result of nine and zeroes
     */
    @Test
    public void addAndCalculateScoreNineAndZeroes(){
        for(int i : nineAndZeroRolls){
            game.rollOnce(i);
        }
        assertEquals(90, game.getScore());
    }

}
