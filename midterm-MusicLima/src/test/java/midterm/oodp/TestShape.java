package midterm.oodp;
import org.junit.Before;
import org.junit.Test;

import midterm.oodp.ood.shape.*;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
public class TestShape {
	private ShapeProgram shape; 	
	
	 @Before
	 public void setUp() {
		 shape = new ShapeProgram();	
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
		 shape.start();
		 assertEquals(shape.shapeArray[0].getTypeName(),"Parallelogram");
		 assertEquals(shape.shapeArray[0].getBase(),10.0,0);
		 assertEquals(shape.shapeArray[0].getHeight(),5.0,0);
		 assertEquals(shape.shapeArray[0].calulateArea(),50.0,0);
		 
		 assertEquals(shape.shapeArray[1].getTypeName(),"Triangle");
		 assertEquals(shape.shapeArray[1].getBase(),10.0,0);
		 assertEquals(shape.shapeArray[1].getHeight(),5.0,0);
		 assertEquals(shape.shapeArray[1].calulateArea(),25.0,0);
		 
	 }
	    
}
