package com;

/**
 * The main class that is used for testing the BowlingScorer during development
 */
public class BowlingGame {

    public static void main(String[] args){
        //Different rolls which I should check to confirm the functionality of BowlingScorer
        int[] zeroRolls = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] singleOneRolls = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] oneRolls = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int[] oneSpareRollsZeroes = {5,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] oneSpareRollsTwoOnes = {5,5,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] oneStrikeRollsZeroes = {10,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] oneStrikeRollsTwoOnes = {10,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        //Create a new BowlingScorerer
        BowlingScorer scorer = new BowlingScorer();

        //Test and print the different results
        System.out.println("Score for zero's: " + scorer.calculateScore(zeroRolls));
        System.out.println("Score for single one: " + scorer.calculateScore(singleOneRolls));
        System.out.println("Score for one's: " + scorer.calculateScore(oneRolls));
        System.out.println("Score for one spare and zeroes: " + scorer.calculateScore(oneSpareRollsZeroes));
        System.out.println("Score for one spare and two one's: " + scorer.calculateScore(oneSpareRollsTwoOnes));
        System.out.println("Score for one strike and zeroes: " + scorer.calculateScore(oneStrikeRollsZeroes));
        System.out.println("Score for one strike and two one's: " + scorer.calculateScore(oneStrikeRollsTwoOnes));
    }
}
