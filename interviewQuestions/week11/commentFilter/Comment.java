package interviewQuestions.week11.commentFilter;

import java.util.Date;

/*
 *  - comment String
 *  - date String
 *  - userid int
 *  --------------------
 *  + isValidComment() : boolean
 */

public class Comment {
	
	private String comment;
	private Date date;
	private int userId;
	
	//Inheritance
	public Comment(){
	}
	
	public Comment(String comment, int userId){
		this.comment = comment;
		this.date = new Date();
		this.userId = userId;
	}
	
	public String getComment() {
		return comment;
	}

	public Date getDate() {
		return date;
	}

	public int getUserId() {
		return userId;
	}

	public boolean isValid(){
		return Filter.filterBadWords(this.comment);
	}
	

}
