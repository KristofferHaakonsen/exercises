package com;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * This class tests the BowlingScorer's methods
 * */
public class BowlingScorerTest {
    private BowlingScorer scorer = new BowlingScorer();

    //Test rolls
    private int[] zeroRolls = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    private int[] oneRolls = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
    private int[] nineAndZeroRolls = {9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0};
    private int[] spareRolls = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
    private int[] strikeRolls = {10,10,10,10,10,10,10,10,10,10,10,10};

    //Tests calculateScore with only zero rolls
    @Test
     public void calculateOnlyZeroesScore() {
        assertEquals(0, scorer.calculateScore(zeroRolls) );
    }

    //Tests calculateScore with only one rolls
    @Test
    public void  calculateOnlyOnesScore() {
        assertEquals(20, scorer.calculateScore(oneRolls) );
    }

    //Tests calculateScore with every other roll being nine and zero
    @Test
    public void  calculateNinesAndZeroesRollsScore() {
        assertEquals(90, scorer.calculateScore(nineAndZeroRolls) );
    }

    //Tests calculateScore with every roll being a spare
    @Test
    public void  calculateOnlySparesScore() {
        assertEquals(150, scorer.calculateScore(spareRolls) );
    }

    //Tests calculateScore with every roll being a strike
    @Test
    public void  calculateOnlyStrikesScore() {
        assertEquals(300, scorer.calculateScore(strikeRolls) );
    }


}
