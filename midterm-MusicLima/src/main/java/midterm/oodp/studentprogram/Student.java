package midterm.oodp.studentprogram;

public class Student {
	private String name;
	private double score;
	private String major;
	private char grade;
	
	//TODO: complete this Constructor for initial value of name, score, and major
	public Student(double score,String name,char grade,String major) {
		this.score=score;
		this.name=name;
		this.major=major;
		this.grade=grade;
		
	}
	public Student(String name , double score , String major)
    {
        this.name = name;
        this.score = score;
        this.major = major;
        this.grade = ' ';
    }
	
	//TODO: implement this
	public double getScore() {
		return score;
		
	}
	//TODO: implement this
	public void setScore(double score) {
		this.score=score;
		
	}
	//TODO: implement this
	public String getName() {
		return this.name;
		
	}
	//TODO: implement this
	public void setName(String name) {
		this.name=name;
	}
	//TODO: implement this
	public String getMajor() {
		return this.major;
		
	}
	//TODO: implement this
	public void setMajor(String major) {
		this.major=major;
		
	}
	//TODO: implement this
	public char getGrade() {
		return this.grade;
		
	}
	//TODO: implement this
	public void setGrade(char grade) {
		this.grade=grade;
	}
	
	@Override
	
	//TODO: complete this method to print out student phone info.
	// [Peter] is in major [SE] has score= [85.55] and grade= [A]
	public String toString() {
		return this.name+"is in "+this.major+"has score="+this.score+"and grade= "+this.grade;
	}
	
	

}
