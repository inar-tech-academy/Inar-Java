package interviewQuestions.week11;

import java.util.Scanner;

public class Location {
	/*
	 * - row (int)
	 * - col (int)
	 * - points (double[][])
	 * - maxValue(double)
	 * -------------------------
	 * + Location(row,col) 
	 * + fillingLocationPoints()
	 * + getMaxValue()
	 * 
	 */
	
	private int row;
	private int col;
	private double[][] points;
	private double maxValue;
	
	public Location(int row, int col){
		this.row = row; 
		this.col = col;
		this.points = new double[row][col];
		this.maxValue = Double.MIN_VALUE;
	}
	
	public void fillingLocationPoints(){
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < this.points.length; i++) {
			for (int j = 0; j < this.points[0].length; j++) {
				this.points[i][j] = input.nextDouble();
			}
		}
	}
	
	private void updateMaxValue(){	
		for (int i = 0; i < this.points.length; i++) {
			for (int j = 0; j < this.points[i].length; j++) {
				if (points[i][j] > this.maxValue) {
					this.maxValue = this.points[i][j];
				}
			}
		}
	}
	
	public double getMaxValue(){
		updateMaxValue();
		return this.maxValue;
	}
	
	

}
