package midterm.oodp;


import org.junit.Before;
import org.junit.Test;

import midterm.oodp.studentprogram.Student;
import midterm.oodp.studentprogram.StudentProgram;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
public class TestStudent {
	
	
	  private StudentProgram sp; 
	  private Student[] st_array;

	    @Before
	    public void setUp() {
	    	sp= new StudentProgram();
	    	st_array= sp.start();
	    	

	    }
	    
	    private ByteArrayOutputStream outContent;

	    @Before
	    public void setUpStreams() {
	        outContent = new ByteArrayOutputStream();
	        System.setOut(new PrintStream(outContent));
	    }

	    @After
	    public void cleanUpStreams() {
	        System.setOut(null);
	    }
	    
	    @Test
	    public void testConstructor() {

	        assertEquals("Peter", st_array[0].getName());
	        assertEquals("SE", st_array[0].getMajor());
	        assertEquals(85.55 , st_array[0].getScore(), 0.001);
	        
	        assertEquals("Molly", st_array[1].getName());
	        assertEquals("SE", st_array[1].getMajor());
	        assertEquals(65.69  , st_array[1].getScore(), 0.001);
	        
	        assertEquals("Nicky", st_array[2].getName());
	        assertEquals("MTA", st_array[2].getMajor());
	        assertEquals(49.55  , st_array[2].getScore(), 0.001);
	        
	        assertEquals("Justine", st_array[3].getName());
	        assertEquals("DBTI", st_array[3].getMajor());
	        assertEquals(59.95  , st_array[3].getScore(), 0.001);       
	
	    }
	    
	    @Test
	    public void testComputeGrade() {
	    	sp.computeGrade(st_array);
	    	assertEquals('A', st_array[0].getGrade());
	    	assertEquals('C', st_array[1].getGrade());
	    	assertEquals('F', st_array[2].getGrade());
	    	assertEquals('D', st_array[3].getGrade());
	    	
	    }
	    
	    @Test
	    public void testUpdateMajorFail() {
	    	sp.updateMajor(st_array, "Alex", "CE");
	    	assertEquals("Cannot find student name: Alex",outContent.toString().trim());

	    	
	    }
	    
	    @Test
	    public void testUpdateMajor() {
	    	sp.updateMajor(st_array, "Molly", "CE");
	    	
	    	assertEquals("Peter", st_array[0].getName());
		    assertEquals("SE", st_array[0].getMajor());
		    

			assertEquals("Molly", st_array[1].getName());
			assertEquals("CE", st_array[1].getMajor());
			
			assertEquals("Nicky", st_array[2].getName());
			assertEquals("MTA", st_array[2].getMajor());
			
			assertEquals("Justine", st_array[3].getName());
			assertEquals("DBTI", st_array[3].getMajor());
			
	    	
	    }
	    

}
