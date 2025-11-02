package com.tnsif.assignmentone.assignment6;
	import java.util.ArrayList;

	public class Studentscores{
	    private int[] scores;

	    // Constructor to initialize array
	    public Studentscores(int[] scores) {
	        this.scores = scores;
	    }

	    // Method to convert array to ArrayList
	    public ArrayList<Integer> getScoresList() {
	        ArrayList<Integer> scoreList = new ArrayList<>();
	        for (int score : scores) {
	            scoreList.add(score);
	        }
	        return scoreList;
	    }

}
