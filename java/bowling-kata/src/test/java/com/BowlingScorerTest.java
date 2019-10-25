package com;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * This class tests the BowlingScorer's methods
 * */
public class BowlingScorerTest {
    private BowlingScorer scorer;

    //Test rolls
    private int[] zeroRolls = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    private int[] oneRolls = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
    private int[] nineAndZeroRolls = {9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0};
    private int[] spareRolls = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
    private int[] strikeRolls = {10,10,10,10,10,10,10,10,10,10,10,10};

    @Before
    public void setUp(){
        scorer = new BowlingScorer();
    }

    //Tests calculateScore with only zero rolls
    @Test
     public void calculateOnlyZeroesScore() {
        for(int i : zeroRolls){
            scorer.rollOnce(i);
        }

        assertEquals(0, scorer.calculateScore() );
    }

    //Tests calculateScore with only one rolls
    @Test
    public void  calculateOnlyOnesScore() {
        for(int i : oneRolls){
            scorer.rollOnce(i);
        }

        assertEquals(20, scorer.calculateScore() );
    }

    //Tests calculateScore with every other roll being nine and zero
    @Test
    public void  calculateNinesAndZeroesRollsScore() {
        for(int i : nineAndZeroRolls){
            scorer.rollOnce(i);
        }
        assertEquals(90, scorer.calculateScore() );
    }

    //Tests calculateScore with every roll being a spare
    @Test
    public void  calculateOnlySparesScore() {
        for(int i : spareRolls){
            scorer.rollOnce(i);
        }
        assertEquals(150, scorer.calculateScore() );
    }

    //Tests calculateScore with every roll being a strike
    @Test
    public void  calculateOnlyStrikesScore() {
        for(int i : strikeRolls){
            scorer.rollOnce(i);
        }

        assertEquals(300, scorer.calculateScore() );
    }


}
