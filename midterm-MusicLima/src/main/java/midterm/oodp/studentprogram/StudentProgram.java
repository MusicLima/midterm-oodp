package midterm.oodp.studentprogram;
import java.util.Objects;

public class StudentProgram {
	
    
	public Student[]  start() {
		Student[] std_array = new Student[4] ;
		//TODO: uncomment 
		std_array[0] = new Student("Peter", 85.55, "SE");
		std_array[1] = new Student("Molly", 65.69, "SE");
		std_array[2] = new Student("Nicky", 49.55, "MTA");
		std_array[3] = new Student("Justine", 59.95, "DBTI");
		return std_array;
		
	}
	//TODO: complete this method to compute students' grades by their scores 
	// A: 100>=score>=80, B: 80>score>=70, C:70>score>=60, D: 60>score>=50, F: score<50
	
	public void computeGrade(Student[] studentArray) {				
		for(Student student :studentArray) {
			
			double score = student.getScore();
			
			if(score<=100&&score>=80) {
				student.setGrade('A');
			}
			else if( score>=70) {
				student.setGrade('B');
			}
			else if(score>=60) {
				student.setGrade('C');
			}
			else if( score>=50) {
				student.setGrade('D');
			}
			else {
				student.setGrade('F');
			}
		}
		
		
	}
	
	//TODO: complete this method to update student's major by student name
	//If find the student print: [Molly]'s major is updated to [CE]
	// if not print: Cannot find student name: [Alex]

	public void updateMajor(Student[] studentArray,String name, String major) {		
		for (int i = 0 ; i < studentArray.length ; i++)
        {
            Student student = studentArray[i];

            if(Objects.equals(student.getName(), name))
            {

                System.out.println( name+"'s major is updated to " + major);
                student.setMajor(major);


                break;
            }

            else if (i == studentArray.length-1)
            {
                System.out.println("Cannot find student name: " + name);
            }

        }
        
    }

	
    //TODO: complete this method to update student's major by student name
	// You must call the override method toString() in Student class
	
	public void printDescriptions(Student[] studentArray) {
		
		System.out.println("=====Student List=====");		
		 for(Student student : studentArray) {
			 System.out.println(student.toString());
		 }		
	}
		
	public static void main(String[] args) {		
		
		System.out.println("===== Student Program =====");
		//TODO: create an object called 'sp' of StudentProgram
		
		StudentProgram sp = new StudentProgram();
		
		//TODO: declare and initialize an array of student object called 'studentArray' with the length of 4
		
		Student[] studentArray = new Student[4];
		
		//TODO: uncomment these 2 lines
		
		studentArray = sp.start();		
		sp.printDescriptions(studentArray);
		
		
		//Compute Grade
		System.out.println("===== Compute Garde===== ");	
		//TODO: uncomment these 2 lines
		
		sp.computeGrade(studentArray);
		sp.printDescriptions(studentArray);
		
		//Update major by student name System.out.println("===== Set Major=====");
		System.out.println("===== Update Major===== ");	
		//TODO: uncomment these 3 lines
		
		sp.updateMajor(studentArray,"Alex", "CE");
		sp.updateMajor(studentArray,"Molly", "CE");			
		sp.printDescriptions(studentArray);
				
		
	}
	
	
	

}
